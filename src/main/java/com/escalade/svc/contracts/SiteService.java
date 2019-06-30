package com.escalade.svc.contracts;

import com.escalade.data.model.Site;
import org.springframework.data.domain.Page;

import org.springframework.data.domain.Pageable;
import java.util.List;

public interface SiteService {

    void createSite(Site s);
    Site getSite(String name);
    Iterable<Site> listSite();
    Page<Site> findAllByTopoId(int topoId, Pageable pageable);
    Site getSiteBySiteId(int siteId);
    List<Site> getSiteByResearch(String location, String cotationMini, String cotationMaxi);

}
