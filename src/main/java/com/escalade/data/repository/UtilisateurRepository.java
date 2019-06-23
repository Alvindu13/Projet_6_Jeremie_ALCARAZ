package com.escalade.data.repository;

import com.escalade.data.model.Utilisateur;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface UtilisateurRepository extends CrudRepository<Utilisateur, String> {


    Utilisateur findByUserName(String user);

    /*
    @Query(value=" INSERT INTO user_role VALUES ('USER', ?1) ", nativeQuery = true)
    void saveUserRole(int userId);*/


}
