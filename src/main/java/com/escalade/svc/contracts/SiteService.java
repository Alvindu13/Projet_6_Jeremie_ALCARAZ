package com.escalade.svc.contracts;

import com.escalade.data.model.Site;
import org.springframework.data.domain.Page;

import org.springframework.data.domain.Pageable;
import java.util.List;

public interface SiteService {

    void createSite(Site s);
    Page<Site> findAllByTopoId(int topoId, Pageable pageable);
    Site getSiteBySiteId(int siteId);
    List getSiteByResearch(String location, String cotationMini, String cotationMaxi);
    Iterable<String> getDisctinctLocation();
    Page<Site> findAllSiteByCritera(String mc, Pageable pageable);


    /*Site getSite(String name);
    Iterable<Site> listSite();*/

}
