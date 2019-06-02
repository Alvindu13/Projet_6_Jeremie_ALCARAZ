package com.escalade.svc.contracts;

import com.escalade.data.model.Utilisateur;

import java.util.List;

public interface UtilisateurService {

    Utilisateur getUserbyUserName(String username);
    void createUser(String username, String firstName, String lastName, String password, Integer nbTopo);
    Utilisateur getUser(String username);
    List<Utilisateur> listUser();
}
