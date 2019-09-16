package com.escalade.data.repository;

import com.escalade.data.model.Way;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface WayRepository extends CrudRepository<Way, Integer> {

    Page<Way> findAllBySectorId(Integer sectorId, Pageable pageable);


    @Query (value = "SELECT *" +
            "FROM way v " +
            "INNER JOIN sector sec ON sec.sector_id = v.sector_id \n" +
            "INNER JOIN site s ON s.site_id = sec.site_id \n" +
            "WHERE s.location = ?1 AND v.cotation BETWEEN ?2 AND ?3", nativeQuery = true)
    List<Way> findAllByFilterSite(String location, String cotationMini, String cotationMaxi);


}
