package com.escalade.controller;

import com.escalade.domain.dao.service.impl.CommentaireDao;
import com.escalade.domain.dao.service.impl.TopoDao;
import com.escalade.domain.dao.service.impl.UtilisateurDao;


import com.escalade.domain.model.Commentaire;
import com.escalade.domain.model.Utilisateur;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.security.Principal;
import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

@Controller
public class MainController {

    private Utilisateur utilisateur;
    private Commentaire commentaire;

    @Autowired
    private UtilisateurDao utilisateurDao;

    @Autowired
    private CommentaireDao commentaireDao;

    @Autowired
    private TopoDao topoDao;


    @RequestMapping(value = "/emp", method = RequestMethod.GET)
    public String index( Model model)
    {

        //appContext = new ClassPathXmlApplicationContext("spring-data.xml");
        //utilisateurDao = (UtilisateurDao) appContext.getBean("utilisateurDao"); // RECUPERATION DAO !!!

        /*utilisateur = utilisateurDao.getUserbyUserName(("Alvindu16"));
        String login = utilisateur.getLastName();*/

        commentaire = commentaireDao.getCommentaireById(1);
        String content = commentaire.getContent();

        model.addAttribute("commentaire", content);

        return "emp";
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
        return "home";
    }


    /**
     * Test spring security
     */


    /*@RequestMapping(value = {"/", "/welcome**"} , method = RequestMethod.GET)
    public ModelAndView welcomePage() {

        ModelAndView model = new ModelAndView();
        model.addObject("title", "Spring Security Hello World");
        model.addObject("message", "This is welcome page!");
        model.setViewName("hello");
        return model;

    }

    @RequestMapping(value ={"/admin**"}, method = RequestMethod.GET)
    public ModelAndView adminPage() {

        ModelAndView model = new ModelAndView();
        model.addObject("title", "Spring Security Hello World");
        model.addObject("message", "This is protected page!");
        model.setViewName("admin");

        return model;

    }*/

    @RequestMapping(value = { "/", "/welcome" }, method = RequestMethod.GET)
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
    public String loginPage(Model model ) {
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

        System.out.println("User Name: "+ userName);

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
        return "403Page";
    }

    @RequestMapping(value = "/cmt", method = RequestMethod.GET)
    public ModelAndView showFormComment() {
        System.out.println("cmt");
        return new ModelAndView("addcmt", "commentaire", new Commentaire());
    }


    @RequestMapping(value = "/addcmt", method = RequestMethod.POST)
    public String postComment(@ModelAttribute("Commentaire") Commentaire commentaire) {
        System.out.println("addcmt");
        System.out.println(commentaire);

        commentaireDao.saveCommentaire(1, commentaire.getContent(), commentaire.getUserName());


        return "addcmt";
    }

    @RequestMapping(value = "/topo", method = RequestMethod.GET)
    public String displayTopo(Model model) {
        return "galeryTopo";
    }
}