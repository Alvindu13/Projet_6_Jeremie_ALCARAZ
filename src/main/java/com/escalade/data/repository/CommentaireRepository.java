package com.escalade.data.repository;

import com.escalade.data.model.Commentaire;
import com.escalade.data.model.Site;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CommentaireRepository extends CrudRepository<Commentaire, Integer> {

    @Query(value= "select * from commentaire  where site_id = ?1", nativeQuery = true)
    List<Commentaire> getAllCommentaireBySiteId(int siteId);



}
