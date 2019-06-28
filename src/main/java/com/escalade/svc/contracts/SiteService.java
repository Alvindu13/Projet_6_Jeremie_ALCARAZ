package com.escalade.svc.contracts;

import com.escalade.data.model.Site;

import java.util.List;

public interface SiteService {

    public void createSite(Site s);
    public Site getSite(String name);
    public Iterable<Site> listSite();
    public List<Site> listSiteByTopoId(int topoId);
    public Site getSiteBySiteId(int siteId);
    public List<Site> getSiteByResearch(String location, String cotationMini, String cotationMaxi);

}
