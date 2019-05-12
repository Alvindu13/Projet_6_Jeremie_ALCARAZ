package com.escalade.domain.dao.contract;

import com.escalade.domain.model.Site;

import java.util.List;

public interface ISiteDao {

    public void createSite(String name, int topo_id, String location, String comment);
    public Site getSite(String name);
    public List<Site> listSite();
}
