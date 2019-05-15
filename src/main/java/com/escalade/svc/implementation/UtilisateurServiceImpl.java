package com.escalade.svc.implementation;

import com.escalade.data.repository.UtilisateurRepository;
import com.escalade.data.model.Utilisateur;
import com.escalade.svc.contracts.UtilisateurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("utilisateurService")
public class UtilisateurServiceImpl implements UtilisateurService {


    @Autowired
    private UtilisateurRepository repo;

    private Utilisateur utilisateur;


    public Utilisateur getUserbyUserName(String userName) {
        //utilisateur = utilisateurDao.getUserbyUserName((userName));
        return null;
    }

    public void createUser(String username, String firstName, String lastName, String password, Integer nbTopo) {

    }

    public Utilisateur getUser(String username) {
        return null;
    }

    public List<Utilisateur> listUser() {
        return null;
    }
}
