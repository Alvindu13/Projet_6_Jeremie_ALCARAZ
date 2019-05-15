package com.escalade.svc.contracts;

import com.escalade.data.model.Utilisateur;

import java.util.List;

public interface UtilisateurService {

    public Utilisateur getUserbyUserName(String username);
    public void createUser(String username, String firstName, String lastName, String password, Integer nbTopo);
    public Utilisateur getUser(String username);
    public List<Utilisateur> listUser();
}
