package com.escalade.controller;

import com.escalade.dao.UtilisateurDao;
import com.escalade.model.Utilisateur;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.security.Principal;
import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

@Controller
public class MainController {

    //private Employe emp;
    //private EmployeDao2 dao2;

    private Utilisateur utilisateur;
    private UtilisateurDao utilisateurDao;


    private ClassPathXmlApplicationContext appContext;

    /*@Before
    public void setUp() throws Exception {
        appContext = new ClassPathXmlApplicationContext("spring-data.xml");
        dao2 = (EmployeDao2)appContext.getBean("employeDao2"); // RECUPERATION DAO !!!
        emp = dao2.getEmployeById(2);
    }*/

    @RequestMapping(value = "/emp", method = RequestMethod.GET)
    public String index( Model model)
    {

        appContext = new ClassPathXmlApplicationContext("spring-data.xml");
        utilisateurDao = (UtilisateurDao) appContext.getBean("utilisateurDao"); // RECUPERATION DAO !!!

        utilisateur = utilisateurDao.getEmployeByUserName(("Alvindu15"));
        String login = utilisateur.getFirstName();
        model.addAttribute("prenom", login);

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
}