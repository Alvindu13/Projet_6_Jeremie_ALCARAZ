package com.escalade.controller;

import com.escalade.data.model.Image;
import com.escalade.data.model.Site;
import com.escalade.svc.contracts.ImageService;
import com.escalade.svc.contracts.SiteService;
import com.escalade.svc.contracts.TopoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class SiteController {


    @Autowired
    SiteService daoSite;

    @Autowired
    ImageService daoImg;

    @Autowired
    TopoService daoTopo;


    /**
     * afficher tous les sites d'escalade
     *
     * @param model
     * @return la page sites
     */
    @RequestMapping(value = "/sites", method = RequestMethod.GET)
    public String displayAllSites(@RequestParam("topoId") int topoId, Model model) {
        model.addAttribute("sites", daoSite.listSiteByTopoId(topoId));
        //model.addAttribute("images", daoImg.getAllImage());
        return "site/sites";
    }

    /**
     * afficher le site d'escalade sélectionné
     *
     * @param model
     * @return la page site
     */
    @RequestMapping(value = "/site", method = RequestMethod.GET)
    public String displaySiteAlone(@RequestParam("siteId") int siteId, Model model) {
        model.addAttribute("site", daoSite.getSiteBySiteId(siteId));
        return "site/site";
    }

    /**
     * Affiche le formulaire d'ajout de site
     *
     * @return
     */
    @RequestMapping(value = "/addsite", method = RequestMethod.GET)
    public String submit(Model model) {
        model.addAttribute("topos", daoTopo.listTopo());
        return "site/addsite";

    }



    @RequestMapping(value = "/addsite", method = RequestMethod.POST)
    public ModelAndView submit(@ModelAttribute("site") Site site, @RequestParam("image") Image img) {
        daoSite.createSite(site);
        try {
            daoImg.saveImage(img);
            return new ModelAndView("site/sites", "msg", "Records succesfully inserted into database.");

        } catch (Exception e) {
            return new ModelAndView("site/sites", "msg", "Error: " + e.getMessage());
        }
    }


}
