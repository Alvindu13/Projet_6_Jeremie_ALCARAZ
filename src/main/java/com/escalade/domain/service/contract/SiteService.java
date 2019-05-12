package com.escalade.domain.service.contract;

import com.escalade.domain.model.Site;

import java.util.List;

public interface SiteService {

    public void createSite(Site s);
    public Site getSite(String name);
    public List<Site> listSite();
}
