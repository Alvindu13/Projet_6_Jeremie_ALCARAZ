package com.escalade.dao.contract;

import com.escalade.model.Utilisateur;

import java.util.List;

public interface IUtilisateurDao {

    public Utilisateur getUserbyUserName(String username);
    public void createUser(String username, String firstName, String lastName, String password, Integer nbTopo);
    public Utilisateur getUser(String username);
    public List<Utilisateur> listUser();
}
