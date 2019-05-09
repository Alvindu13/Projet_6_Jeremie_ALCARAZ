package com.escalade.domain.service.impl;

import com.escalade.domain.dao.impl.SiteDao;
import com.escalade.domain.model.Site;
import com.escalade.domain.service.contract.SiteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("siteService")
public class SiteServiceImpl implements SiteService {


    @Autowired
    private SiteDao dao;

    public void createSite(String name, String location, String comment) {

    }

    public Site getSite(String name) {
        return null;
    }

    public List<Site> listSite() {
        List<Site> sites = dao.listSite();

        return sites;
    }
}
