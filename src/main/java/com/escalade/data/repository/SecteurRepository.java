package com.escalade.data.repository;

import com.escalade.data.model.Secteur;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface SecteurRepository extends CrudRepository<Secteur, Integer> {


    @Query(value= "select * from secteur  where site_id = ?1", nativeQuery = true)
    List<Secteur> findAllBySiteId(int site_id);

    @Query(value= "select COUNT(*) from secteur  where site_id = ?1", nativeQuery = true)
    long getCountBySiteId(int site_id);
}
