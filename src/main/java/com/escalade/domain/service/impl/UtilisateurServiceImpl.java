package com.escalade.domain.service.impl;

import com.escalade.domain.dao.impl.UtilisateurDao;
import com.escalade.domain.model.Utilisateur;
import com.escalade.domain.service.contract.UtilisateurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("utilisateurService")
public class UtilisateurServiceImpl implements UtilisateurService {


    @Autowired
    private UtilisateurDao utilisateurDao;
    private Utilisateur utilisateur;


    public Utilisateur getUserbyUserName(String userName) {
        utilisateur = utilisateurDao.getUserbyUserName((userName));
        return utilisateur;
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
