package com.escalade.svc.implementation;

import com.escalade.data.model.*;

import com.escalade.data.repository.SiteRepository;
import com.escalade.svc.contracts.SiteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.*;

import org.springframework.data.domain.Pageable;
import java.util.ArrayList;
import java.util.List;

@Service("siteService")
public class SiteServiceImpl implements SiteService {


    @Autowired
    private SiteRepository repo;

    public void createSite(Site s) {
        Site site = repo.save(s);
    }

    public Site getSite(String name) {
        return null;
    }

    public Iterable<Site> listSite() {

         Iterable<Site> site = repo.findAll();
        return site;
    }

    @Override
    public Page<Site> findAllByTopoId(int topoId, Pageable pageable) {
        return repo.findAllByTopoId(topoId, pageable);
    }


    public Site getSiteBySiteId(int siteId){
        return repo.findBySiteId(siteId);

    }

    @Override
    public List<Site> getSiteByResearch(String location, String cotationMin, String cotationMax) {
        return repo.findSiteByMultiCriterias(location, cotationMin, cotationMax);
    }
}
