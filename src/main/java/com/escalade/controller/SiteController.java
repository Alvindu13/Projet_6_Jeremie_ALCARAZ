package com.escalade.controller;

import com.escalade.data.model.Commentaire;
import com.escalade.data.model.Image;
import com.escalade.data.model.Site;
import com.escalade.data.model.Topo;
import com.escalade.svc.contracts.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;


@Controller
//@RequestMapping("sites")
public class SiteController {


    @Autowired
    SiteService svcSite;

    @Autowired
    ImageService svcImg;

    @Autowired
    TopoService svcTopo;

    @Autowired
    CommentaireService svcCmt;

    @Autowired
    SecteurService svcSect;

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
    public String displayAllSites(@ModelAttribute("site") Site site, @RequestParam("topoId") int topoId, Model model) {
        model.addAttribute("sites", svcSite.listSiteByTopoId(topoId));
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
    public String displaySiteAlone(@RequestParam("siteId") int siteId, Model model) {
        model.addAttribute("site", svcSite.getSiteBySiteId(siteId));
        model.addAttribute("cmtTest", svcCmt.getAllCommentaireBySiteId(siteId));
        model.addAttribute("countSect", svcSect.getCountSecteur(siteId));
        return "site/site";
    }

    /**
     * Affiche le formulaire d'ajout de site
     *
     * @return
     */
    @RequestMapping(value = "/addsite", method = RequestMethod.GET)
    public String submit(@ModelAttribute("topo") Topo topo, @RequestParam("topoId") int topoId, Model model) {
        model.addAttribute("topo", svcTopo.getTopoById(topoId));
        return "site/addsite";
    }



    @RequestMapping(value = "/addsite", method = RequestMethod.POST)
    public String submit(@ModelAttribute("site") Site site,@RequestParam("topoId") int topoId, @ModelAttribute("topo") Topo topo ) {
        site.setTopoId(topoId);
        svcSite.createSite(site);
        return "site/addsite";
    }


    /**
     * Get request to show form comment
     *
     * @return ModelAndView with view addcmt and commentaire model
     */
    @RequestMapping(value = "/cmt", method = RequestMethod.GET)
    public ModelAndView showFormComment() {
        return new ModelAndView("cmt/addcmtT", "commentaire", new Commentaire());
    }

    /**
     * Ajoute une commentaire dans la db
     * @param commentaire
     * @return
     */
    @RequestMapping(value = "/addcmt", method = RequestMethod.POST)
    public ModelAndView postComment(@ModelAttribute("Commentaire") Commentaire commentaire) {
        svcCmt.saveCommentaire(commentaire);
        return new ModelAndView("redirect:/site?siteId=" + commentaire.getSiteId());
    }



}
