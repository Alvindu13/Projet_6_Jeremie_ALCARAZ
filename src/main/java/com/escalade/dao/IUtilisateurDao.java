package com.escalade.dao;

import com.escalade.model.Utilisateur;

public interface IUtilisateurDao {

    public Utilisateur getEmployeByUserName(String username);
}
