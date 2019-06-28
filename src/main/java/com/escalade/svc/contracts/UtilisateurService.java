package com.escalade.svc.contracts;

import com.escalade.data.model.Utilisateur;
import org.springframework.security.core.userdetails.User;

import java.util.List;

public interface UtilisateurService {

    Utilisateur getUserbyUserName(String username);
    void createUser(Utilisateur user);
    Utilisateur getUser(String username);
    List<Utilisateur> listUser();
    Utilisateur findByUtilisateurId(int utilisateurId);
    //void roleUserSave(int userId);

}
