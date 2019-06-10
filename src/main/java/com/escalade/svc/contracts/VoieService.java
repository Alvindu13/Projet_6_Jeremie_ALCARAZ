package com.escalade.svc.contracts;

import com.escalade.data.model.Secteur;
import com.escalade.data.model.Site;
import com.escalade.data.model.Voie;

import java.util.List;

public interface VoieService {

    Iterable<Voie> listVoies();

    List<Voie> listVoiesBySecId(int secteurId);

    Voie getCountVoie(int secteurId);

}
