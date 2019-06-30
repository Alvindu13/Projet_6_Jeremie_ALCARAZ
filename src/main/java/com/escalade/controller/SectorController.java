package com.escalade.controller;

import com.escalade.data.model.Secteur;
import com.escalade.svc.contracts.SecteurService;
import com.escalade.svc.contracts.SiteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SectorController {



    @Autowired
    SecteurService svcSecteur;

    /**
     * afficher les secteurs d'escalade selon le site sur lequel nous nous trouvons
     *
     * @param model
     * @return la page secteur
     */
    @RequestMapping(value = "/secteur", method = RequestMethod.GET)
    public String displaySector(@RequestParam("siteId") int siteId,
                                Model model) {

        model.addAttribute("siteId", siteId);
        model.addAttribute("secteurs", svcSecteur.listSecteur(siteId));

        return "secteur/secteur";
    }


    /**
     * afficher les secteurs d'escalade selon le site sur lequel nous nous trouvons
     *
     * @return la page secteur
     */
    @RequestMapping(value = "/addsector", method = RequestMethod.GET)
    public String formSector(@RequestParam("siteId") int siteId,
                             @ModelAttribute("sector") Secteur sector,
                             Model model) {
        model.addAttribute("siteId", siteId);
        return "secteur/addsector";
    }


    @RequestMapping(value = "/addsector", method = RequestMethod.POST)
    public String createSector(@ModelAttribute("sector") Secteur sector) {
        svcSecteur.createSecteur(sector);
        return "secteur/addsector";
    }

}
