package com.escalade.svc.implementation;

import com.escalade.data.model.Secteur;
import com.escalade.data.repository.ImageRepository;
import com.escalade.data.model.Image;
import com.escalade.data.repository.SecteurRepository;
import com.escalade.svc.contracts.ImageService;
import com.escalade.svc.contracts.SecteurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;

@Service("secteurService")
public class SecteurServiceImpl implements SecteurService {


    @Autowired
    private SecteurRepository repo;

    public void createSecteur(Secteur s) {repo.save(s);}

    public Secteur getSecteur(String name) {
        return null;
    }

    public long getCountSecteur(int siteId) { return repo.getCountBySiteId(siteId); }

    public Iterable<Secteur> listSecteur(int siteId) {
        return repo.findAllBySiteId(siteId);
    }
}
