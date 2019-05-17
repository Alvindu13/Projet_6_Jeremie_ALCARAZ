package com.escalade.svc.implementation;

import com.escalade.data.repository.SiteRepository;
import com.escalade.data.model.Site;
import com.escalade.svc.contracts.SiteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("siteService")
public class SiteServiceImpl implements SiteService {


    @Autowired
    private SiteRepository repo;

    public void createSite(Site s) {
        repo.save(s);
    }

    public Site getSite(String name) {
        return null;
    }

    public Iterable<Site> listSite() {

         Iterable<Site> site = repo.findAll();
        return site;
    }

    public List<Site> listSiteByTopoId(int topoId){
        return repo.findAllByTopoId(topoId);

    }

    public Site getSiteBySiteId(int siteId){
        return repo.findOne(siteId);

    }
}
