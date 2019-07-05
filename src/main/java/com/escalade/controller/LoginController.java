package com.escalade.controller;

import com.escalade.data.model.UserRole;
import com.escalade.data.model.Utilisateur;
import com.escalade.data.repository.UserRoleRepository;
import com.escalade.svc.contracts.UserRoleService;
import com.escalade.svc.contracts.UtilisateurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.security.Principal;

@Controller
public class LoginController {

    @Autowired
    UtilisateurService userSvc;

    @Autowired
    UserRoleRepository userRoleService;


    /**
     * Page d'accueil du website
     * @param model
     * @return
     */
    @RequestMapping(value = {"/", "/welcome"}, method = RequestMethod.GET)
    public String welcomePage(Model model) {
        model.addAttribute("title", "Welcome");
        model.addAttribute("message", "This is welcome page!");
        return "welcomePage";
    }

    /**
     * Affiche la page pour enregistrer un nouvel utilisateur
     * @param model
     * @return
     */
    @RequestMapping(value = {"/displayRegisterForm"}, method = RequestMethod.GET)
    public ModelAndView registerForm(Model model) {
        return new ModelAndView("login/registerForm", "user", new Utilisateur());
    }

    /**
     * Sauvegarde l'utilisateur dans la database
     * @param user
     * @return
     */
    @RequestMapping(value = {"/saveUser"}, method = RequestMethod.POST)
    public String saveUser(@ModelAttribute("user") Utilisateur user) {
        userSvc.createUser(user);
        userRoleService.save(new UserRole("USER"));

        //userSvc.roleUserSave(user.getUtilisateurId());
        return "redirect:/welcome";
    }


    /**
     * Affiche le formulaire de connexion
     * @param model
     * @return
     */
    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String loginPage(Model model) {
        return "login/loginPage";
    }

    /**
     * Affiche un message si la déconnexion de l'utilisateur s'est correctement déroulée
     * @param model
     * @return
     */
    @RequestMapping(value = "/logoutSuccessful", method = RequestMethod.GET)
    public String logoutSuccessfulPage(Model model) {
        model.addAttribute("title", "Logout");
        return "login/logoutSuccessfulPage";
    }

    /**
     *
     * @param model
     * @param principal
     * @return
     */
    @RequestMapping(value = "/userInfo", method = RequestMethod.GET)
    public String userInfo(Model model, Principal principal) {

        // After user login successfully.
        String userName = principal.getName();

        System.out.println("User Name: " + userName);

        return "login/userInfoPage";
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

}
