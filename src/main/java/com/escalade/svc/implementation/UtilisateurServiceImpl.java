package com.escalade.svc.implementation;

import com.escalade.data.repository.UtilisateurRepository;
import com.escalade.data.model.Utilisateur;
import com.escalade.svc.contracts.UtilisateurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("utilisateurService")
public class UtilisateurServiceImpl implements UtilisateurService {


    @Autowired
    private UtilisateurRepository repo;

    @Override
    public Utilisateur getUserbyUserName(String userName) {
        //utilisateur = utilisateurDao.getUserbyUserName((userName));
        return repo.findByUserName(userName);
    }

    @Override
    public void createUser(Utilisateur user) {
        repo.save(user);
    }

    @Override
    public Utilisateur getUser(String username) {
        return repo.findByUserName(username);
    }

    @Override
    public List<Utilisateur> listUser() {
        return null;
    }

    @Override
    public Utilisateur findByUtilisateurId(int utilisateurId) {
        return repo.findByUtilisateurId(utilisateurId);
    }


}
