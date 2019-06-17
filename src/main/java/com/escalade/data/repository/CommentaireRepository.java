package com.escalade.data.repository;

import com.escalade.data.model.Commentaire;
import com.escalade.data.model.Site;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CommentaireRepository extends CrudRepository<Commentaire, Integer> {

    @Query(value= "select * from commentaire  where site_id = ?1", nativeQuery = true)
    List<Commentaire> getAllCommentaireBySiteId(int siteId);

    Commentaire findByCommentaireId (int commentaireId);



    @Query(value="SELECT * \n" +
            "FROM commentaire c \n" +
            "INNER JOIN Utilisateur u ON u.utilisateur_id = c.utilisateur_id \n" +
            "INNER JOIN Site s ON s.site_id = c.site_id \n" +
            "WHERE u.username = ?1 AND s.site_id = ?2", nativeQuery = true)
    List<Commentaire> findTest ( String user, int siteId);

}
