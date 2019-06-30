package com.escalade.controller;

import com.escalade.data.model.Commentaire;
import com.escalade.data.model.Image;
import com.escalade.data.model.Site;
import com.escalade.data.model.Topo;
import com.escalade.data.repository.CommentaireRepository;
import com.escalade.svc.contracts.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
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
    UtilisateurService svcUser;

    @Autowired
    CommentaireService svcCmt;


    @Autowired
    CommentaireRepository repoCmt;

    @Autowired
    SecteurService svcSect;

    @Autowired
    VoieService svcVoie;

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
    public String displayAllSites(@ModelAttribute("site") Site site,
                                  @RequestParam("topoId") int topoId,
                                  @RequestParam(name = "page", defaultValue = "0") int page,
                                  Model model) {

            Page<Site> pagesSite = svcSite.findAllByTopoId(topoId, PageRequest.of(page, 5));

            model.addAttribute("topoId", topoId);

            model.addAttribute("sites",pagesSite.getContent());
            model.addAttribute("arrayNbPagesSite", new int[pagesSite.getTotalPages()]);
            model.addAttribute("currentPageSite", page);
            model.addAttribute("nbPagesSite", pagesSite.getTotalPages());

            return "site/sites";
    }

    /**
     * afficher le site d'escalade sélectionné
     *
     * @param model
     * @return la page site
     */
    @RequestMapping(value = "site", method = RequestMethod.GET)
    public String displaySiteAlone(@RequestParam(name="page", defaultValue = "0") int page,
                                   @RequestParam("siteId") int siteId,
                                   @RequestParam(name = "user", defaultValue = "") String user,
                                   Model model) {
        Page<Commentaire> pageCmt = repoCmt.comment(user, siteId, PageRequest.of(page, 5));

        model.addAttribute("site", svcSite.getSiteBySiteId(siteId));
        model.addAttribute("cmtTest", svcCmt.getAllCommentaireBySiteId(siteId));
        model.addAttribute("countSect", svcSect.getCountSecteur(siteId));

        model.addAttribute("cmtest",pageCmt.getContent());
        model.addAttribute("pages", new int[pageCmt.getTotalPages()]);
        model.addAttribute("currentPage", page);





        model.addAttribute("user", svcUser.getUserbyUserName(user));




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
    public ModelAndView showFormComment(Model model) {
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
        return new ModelAndView("redirect:/site?siteId=" + commentaire.getSiteId() + "&user=Alvindu13");
    }



}
