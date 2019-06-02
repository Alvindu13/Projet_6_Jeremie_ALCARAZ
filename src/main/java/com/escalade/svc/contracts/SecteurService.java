package com.escalade.svc.contracts;

import com.escalade.data.model.Secteur;

public interface SecteurService {

    void createSecteur(Secteur s);
    Secteur getSecteur(String name);
    long getCountSecteur(int siteId);
    Iterable<Secteur> listSecteur(int siteId);
}
