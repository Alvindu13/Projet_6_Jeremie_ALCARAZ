package com.escalade.data.repository;

import com.escalade.data.model.Site;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface SiteRepository extends CrudRepository<Site, Integer> {

    @Query(value= "select * from site  where topo_id = ?1", nativeQuery = true)
    public List<Site> findAllByTopoId(int topo_id);


    @Query(value= "select * from site  where site_id = ?1", nativeQuery = true)
    public List<Site> listSiteBySiteId(int siteId);


}
