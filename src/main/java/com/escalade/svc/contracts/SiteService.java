package com.escalade.svc.contracts;

import com.escalade.data.model.Site;

public interface SiteService {

    public void createSite(Site s);
    public Site getSite(String name);
    public Iterable<Site> listSite();
}
