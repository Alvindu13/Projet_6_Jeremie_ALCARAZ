package com.escalade.controller;


import com.escalade.data.model.Commentaire;
import com.escalade.data.model.Site;
import com.escalade.data.model.Topo;
import com.escalade.data.model.Utilisateur;
import com.escalade.svc.implementation.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import java.security.Principal;
import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

@Controller
public class MainController {

    private Utilisateur utilisateur;
    private Commentaire commentaire;
    private Topo topo;


    @Autowired
    private TopoServiceImpl topoServiceImpl;

    @Autowired
    private UtilisateurServiceImpl utilisateurServiceImpl;

    @Autowired
    private CommentaireServiceImpl commentaireService;

    @Autowired
    private SiteServiceImpl siteServiceImpl;


    @Autowired
    private ImageServiceImpl imgServ;

    @RequestMapping(value = "/emp", method = RequestMethod.GET)
    public String index(Model model) {
        model.addAttribute("user", utilisateurServiceImpl.getUserbyUserName("Alvindu13"));
        return "autres/emp";
    }



    @RequestMapping("/hello")
    public String home(Locale locale, Model model) {
        Date date = new Date();
        DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
        String formattedDate = dateFormat.format(date);
        model.addAttribute("serverTime", formattedDate);
        return "test/home";
    }


    /**
     * Get request to show form comment
     *
     * @return ModelAndView with view addcmt and commentaire model
     */
    @RequestMapping(value = "/cmt", method = RequestMethod.GET)
    public ModelAndView showFormComment() {
        return new ModelAndView("addcmt", "commentaire", new Commentaire());
    }

    /**
     * Ajoute une commentaire dans la db
     * @param commentaire
     * @return
     */
    @RequestMapping(value = "/addcmt", method = RequestMethod.POST)
    public String postComment(@ModelAttribute("Commentaire") Commentaire commentaire) {
        commentaireService.saveCommentaire(commentaire);
        return "addcmt";
    }




    /**
     * afficher tous les sites d'escalade
     *
     * @param model
     * @return la page sites
     */
   @RequestMapping(value = "/site", method = RequestMethod.GET)
    public String displaySites(Model model) {
        model.addAttribute("sites", siteServiceImpl.listSite());
        model.addAttribute("images", imgServ.getAllImage());
        return "site";
    }

    /**
     * Affiche le formulaire d'ajout de site
     *
     * @return
     */
    @RequestMapping(value = "/addsite", method = RequestMethod.GET)
    public String submit(Model model) {
        model.addAttribute("topos", topoServiceImpl.listTopo());
        return "addsite";

    }



    @RequestMapping(value = "/addsite", method = RequestMethod.POST)
    public ModelAndView submit(@ModelAttribute("site") Site site, @RequestParam("photo") MultipartFile photo) {

        siteServiceImpl.createSite(site);

        try {
            imgServ.saveImage(photo);
            return new ModelAndView("site", "msg", "Records succesfully inserted into database.");

        } catch (Exception e) {
            return new ModelAndView("site", "msg", "Error: " + e.getMessage());
        }
    }



}
