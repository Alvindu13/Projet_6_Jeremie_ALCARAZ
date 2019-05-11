package com.escalade.controller;


import com.escalade.domain.model.Commentaire;
import com.escalade.domain.model.Topo;
import com.escalade.domain.model.Utilisateur;
import com.escalade.domain.model.image.Image;
import com.escalade.domain.service.impl.*;
import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.CacheControl;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.codec.Base64;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;


import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.*;
import java.security.Principal;
import java.text.DateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.io.InputStream;

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


    @RequestMapping("/test")
    public String test() {

        return "test";
    }

    @RequestMapping("/hello")
    public String home(Locale locale, Model model) {
        Date date = new Date();
        DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
        String formattedDate = dateFormat.format(date);
        model.addAttribute("serverTime", formattedDate);
        return "test/home";
    }

    @RequestMapping(value = {"/", "/welcome"}, method = RequestMethod.GET)
    public String welcomePage(Model model) {
        model.addAttribute("title", "Welcome");
        model.addAttribute("message", "This is welcome page!");
        return "welcomePage";
    }

    @RequestMapping(value = "/admin", method = RequestMethod.GET)
    public String adminPage(Model model) {
        return "adminPage";
    }

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String loginPage(Model model) {
        return "loginPage";
    }

    @RequestMapping(value = "/logoutSuccessful", method = RequestMethod.GET)
    public String logoutSuccessfulPage(Model model) {
        model.addAttribute("title", "Logout");
        return "logoutSuccessfulPage";
    }

    @RequestMapping(value = "/userInfo", method = RequestMethod.GET)
    public String userInfo(Model model, Principal principal) {

        // After user login successfully.
        String userName = principal.getName();

        System.out.println("User Name: " + userName);

        return "userInfoPage";
    }

    @RequestMapping(value = "/403", method = RequestMethod.GET)
    public String accessDenied(Model model, Principal principal) {

        if (principal != null) {
            model.addAttribute("message", "Hi " + principal.getName()
                    + "<br> You do not have permission to access this page!");
        } else {
            model.addAttribute("msg",
                    "You do not have permission to access this page!");
        }
        return "autres/403Page";
    }

    /**
     * Get request to show form comment
     *
     * @return ModelAndView with view addcmt and commentaire model
     */
    @RequestMapping(value = "/cmt", method = RequestMethod.GET)
    public ModelAndView showFormComment() {
        System.out.println("cmt");
        return new ModelAndView("addcmt", "commentaire", new Commentaire());
    }

    /**
     * Ajoute une commentaire dans la db
     * @param commentaire
     * @return
     */
    @RequestMapping(value = "/addcmt", method = RequestMethod.POST)
    public String postComment(@ModelAttribute("Commentaire") Commentaire commentaire) {
        System.out.println("addcmt");
        System.out.println(commentaire);

        commentaireService.saveCommentaire(commentaire);
        //commentaireDao.saveCommentaire(1, commentaire.getContent(), commentaire.getUserName());
        return "addcmt";
    }

    /**
     * Affiche la page des topos
     * @param model
     * @return
     */
    @RequestMapping(value = "/topo", method = RequestMethod.GET)
    public String displayTopo(Model model) {
        //List<Topo> topos = topoDao.listTopo();
        //System.out.println(topos.size());
        //model.addAttribute("topos", topos);
        model.addAttribute("topos", topoServiceImpl.listTopo());
        return "galeryTopo";
    }

    /**
     * Affiche le formulaire d'ajout de Topo
     *
     * @return
     */
    @RequestMapping(value = "/atopo", method = RequestMethod.GET)
    public ModelAndView showFormTopo() {
        System.out.println("topo");
        return new ModelAndView("addtopo", "atopo", new Topo());
    }


    /**
     * Permet d'ajouter un Topo
     *
     * @param topo
     * @return la page en cours
     */
    @RequestMapping(value = "/addtopo", method = RequestMethod.POST)
    public String saveTopo(@ModelAttribute("atopo") Topo topo) {
        topoServiceImpl.createTopo(topo);
        return "addtopo";
    }


    /**
     * afficher tous les sites d'escalade
     *
     * @param model
     * @return la page sites
     */
    @RequestMapping(value = "/site", method = RequestMethod.GET)
    public String displaySites(Model model) {
        System.out.println(siteServiceImpl.listSite().size());
        model.addAttribute("sites", siteServiceImpl.listSite());
        model.addAttribute("images", imgServ.getAllImage());
        return "site";
    }

    /**
     * afficher les noms des images
     *
     * @return la page img
     */
    @RequestMapping(value = "/img", method = RequestMethod.GET)
    public String imgTest(Model model) {
        //Image image = imgServ.getImageById(6);//obtain Image instance by id somehow from DAO/Hibernate

        model.addAttribute("images", imgServ.getAllImage());
        return "img";
    }
}
