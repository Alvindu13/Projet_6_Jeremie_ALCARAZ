package com.escalade.controller;

import com.escalade.data.model.Image;
import com.escalade.data.model.Site;
import com.escalade.data.model.Topo;
import com.escalade.svc.contracts.ImageService;
import com.escalade.svc.contracts.SiteService;
import com.escalade.svc.contracts.TopoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;


@Controller
//@RequestMapping("sites")
public class SiteController {


    @Autowired
    SiteService daoSite;

    @Autowired
    ImageService daoImg;

    @Autowired
    TopoService daoTopo;

    @RequestMapping("/request1")
    @ResponseBody
    public String handler(@RequestParam(name = "name") String name) {

        return "URL parameter <br> "
                + "name =" + name;
    }



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
    @RequestMapping(value = "site", method = RequestMethod.GET)
    public String displaySiteAlone(@RequestParam("topoId") int topoId, @RequestParam("siteId") int siteId, Model model) {
        System.out.println(topoId);
        model.addAttribute("topo", daoTopo.getTopoById(topoId));
        model.addAttribute("site", daoSite.getSiteBySiteId(siteId));
        return "site/site";
    }

    /**
     * Affiche le formulaire d'ajout de site
     *
     * @return
     */
    @RequestMapping(value = "/addsite", method = RequestMethod.GET)
    public ModelAndView submit(@ModelAttribute("topo") Topo topo, @RequestParam("topoId") int topoId, Model model) {
        return new ModelAndView("site/addsite", "topo", daoTopo.getTopoById(topoId));

    }



    @RequestMapping(value = "/addsite", method = RequestMethod.POST)
    public String submit(@ModelAttribute("site") Site site, @ModelAttribute("topo") Topo topo ) {
        daoSite.createSite(site);
        return "site/addsite";
    }


}
