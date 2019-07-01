package com.escalade.svc.implementation;

import com.escalade.data.model.Secteur;
import com.escalade.data.model.Voie;
import com.escalade.data.repository.SiteRepository;
import com.escalade.data.model.Site;
import com.escalade.svc.contracts.SiteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

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


        return repo.findAll((Specification<Site>) (root, criteriaQuery, criteriaBuilder) -> {
            List<Predicate> predicates = new ArrayList<>();

            // If designation is specified in filter, add equal where clause
            if (location != null) {
                predicates.add(criteriaBuilder.equal(root.get("location"), location));
            }


            if(cotationMin != null && cotationMax != null){



                Root<Site> site = criteriaQuery.from(Site.class);

                Join<Site, Secteur> secteur = site.join("siteId", JoinType.INNER);
                Join<Secteur, Voie> voie = secteur.join("secteurId", JoinType.INNER);

                predicates.add(criteriaBuilder.between(criteriaBuilder.equal(voie.get("cotation"), "cotation"), root.get("cotationMinimun"), root.get("cotationMaximum")));


                //criteriaQuery.where(criteriaBuilder.equal(voie.get("cotation"), "cotation"));



                //ParameterExpression<String> cotation = criteriaBuilder.parameter(String.class);

            }


            return criteriaBuilder.and(predicates.toArray(new Predicate[0]));
        });

    }
}
