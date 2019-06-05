package com.escalade.data.repository;

import com.escalade.data.model.Site;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;


import java.util.List;

public interface SiteRepository extends CrudRepository<Site, Integer>, JpaSpecificationExecutor {

    @Query(value= "select * from site  where topo_id = ?1", nativeQuery = true)
    List<Site> findAllByTopoId(int topo_id);


    @Query(value= "select * from site  where site_id = ?1", nativeQuery = true)
    List<Site> listSiteBySiteId(int siteId);

    Page<Site> findByLocation(String location, Pageable pageable);



    Site findBySiteId(int siteId);


}
