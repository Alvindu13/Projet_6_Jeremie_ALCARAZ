package com.escalade.svc.implementation;

import com.escalade.data.model.Site;
import com.escalade.data.model.Voie;
import com.escalade.data.repository.SiteRepository;
import com.escalade.data.repository.VoieRepository;
import com.escalade.svc.contracts.VoieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("voieService")
public class VoieServiceImpl implements VoieService {

    @Autowired
    private VoieRepository repo;


    public Iterable<Voie> listVoies() {
        return repo.findAll();
    }

    public List<Voie> listVoiesBySecId(int secteurId) {
        return repo.findAllVoiesBySecteurId(secteurId);
    }

    @Override
    public Voie getCountVoie(int secteurId) {
        return getCountVoie(secteurId);
    }

}
