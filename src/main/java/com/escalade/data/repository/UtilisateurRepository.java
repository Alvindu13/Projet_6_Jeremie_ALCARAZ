package com.escalade.data.repository;

import com.escalade.data.model.Utilisateur;
import org.springframework.data.repository.CrudRepository;

public interface UtilisateurRepository extends CrudRepository<Utilisateur, String> {


    Utilisateur findByUserName(String user);
}
