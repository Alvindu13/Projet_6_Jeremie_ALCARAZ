package com.escalade.data.repository;

import com.escalade.data.model.Site;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;


import java.util.List;

public interface SiteRepository extends CrudRepository<Site, Integer>, JpaSpecificationExecutor {



    @Query(value= "SELECT DISTINCT s.location FROM Site s")
    List<String> findDistinct();


    Page<Site> findAllByTopoId(int topo_id, Pageable pageable);


    @Query(value= "select * from site  where site_id = ?1", nativeQuery = true)
    List<Site> listSiteBySiteId(int siteId);

    Iterable<Site> findByLocation(String location);

    @Query(value="SELECT s FROM Site s WHERE \n" +
            "       s.location LIKE :x OR \n" +
            "               s.name LIKE :x")
    Page<Site> findAllSiteByCritera(@Param("x") String mc, Pageable pageable);

    Site findBySiteId(int siteId);

    //List<Site> findAllByLocationAndCotationAndNbSectorIsLessThanEqual(String location, String cotation, int nbSector);
    //List<Site> findAllByLocationAndCotationMinimumAfterAndCotationMaximumBeforeAndNbSectorIsLessThanEqual(String location, String cotationMinimum, String cotationMaxi, Integer nbSector);

    //@Query (value="select * from site where cotation_minimum AND cotation_maximum between ?1 and ?2", nativeQuery = true)
    //List<Site> findAllByCotationBetween(String cotation1, String cotation2);


    /*@Query (value = "select s from Site s where s.location = ?1 AND (s.cotationMinimum >= ?2 AND s.cotationMaximum <= ?3) AND s.nbSector < ?4 ")
    List<Site> test(String location, String cotationMini, String cotationMaxi, Integer nbsector);*/


    @Query (value ="SELECT  * " +
            "FROM Site s \n" +
            "INNER JOIN sector sec ON sec.site_id = s.site_id \n" +
                "INNER JOIN way v ON v.sector_id = sec.sector_id \n" +
            "WHERE s.location = ?1 AND (v.cotation BETWEEN ?2 AND ?3)", nativeQuery = true)
    List<Site> findSiteByMultiCriterias(String location, String cotationMini, String cotationMaxi);







}
