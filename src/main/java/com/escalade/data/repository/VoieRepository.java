package com.escalade.data.repository;

import com.escalade.data.model.Secteur;
import com.escalade.data.model.Site;
import com.escalade.data.model.Voie;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface VoieRepository extends CrudRepository<Voie, Integer> {

    @Query(value= "select * from voie  where secteur_id = ?1", nativeQuery = true)
    List<Voie> findAllVoiesBySecteurId(int secteurId);



    @Query (value = "SELECT v.cotation, s.name\n" +
            "FROM voie v\n" +
            "INNER JOIN secteur sec ON sec.secteur_id = v.secteur_id\n" +
            "\tINNER JOIN site s ON s.site_id = sec.site_id\n" +
            "WHERE s.location = ?1 AND v.cotation BETWEEN ?2 AND ?3  AND s.nbSector <= ?4 \n", nativeQuery = true)
    List<Voie> findAllByFilterSite(String location, String cotationMini, String cotationMaxi, Integer nbSector);


}
