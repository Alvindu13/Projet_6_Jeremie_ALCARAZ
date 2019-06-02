package com.escalade.data.repository;

import com.escalade.data.model.Secteur;
import com.escalade.data.model.Voie;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface VoieRepository extends CrudRepository<Voie, Integer> {

    @Query(value= "select * from voie  where secteur_id = ?1", nativeQuery = true)
    List<Voie> findAllVoiesBySecteurId(int secteurId);



}
