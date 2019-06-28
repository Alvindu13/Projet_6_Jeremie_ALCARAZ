package com.escalade.svc.implementation;

import com.escalade.data.repository.SiteRepository;
import com.escalade.data.model.Site;
import com.escalade.svc.contracts.SiteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
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

    public List<Site> listSiteByTopoId(int topoId){
        return repo.findAllByTopoId(topoId);

    }

    public Site getSiteBySiteId(int siteId){
        return repo.findBySiteId(siteId);

    }

    @Override
    public List<Site> getSiteByResearch(String location, String cotationMin, String cotationMax) {


        return repo.findAll((Specification<Site>) (root, criteriaQuery, criteriaBuilder) -> {
            List<Predicate> predicates = new ArrayList<>();

            // If designation is specified in filter, add equal where clause
            if (location != null) {
                predicates.add(criteriaBuilder.equal(root.get("location"), location));
            }

            return criteriaBuilder.and(predicates.toArray(new Predicate[0]));
        });

    }
}
