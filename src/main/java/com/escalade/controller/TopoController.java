package com.escalade.controller;

import com.escalade.data.model.Topo;
import com.escalade.data.model.Utilisateur;
import com.escalade.data.repository.TopoRepository;
import com.escalade.data.repository.UtilisateurRepository;
import com.escalade.svc.contracts.CommentaireService;
import com.escalade.svc.contracts.TopoService;
import com.escalade.svc.contracts.UtilisateurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class TopoController {


    @Autowired
    private CommentaireService cmt;

    @Autowired
    private TopoService topoSvc;

    @Autowired
    private TopoRepository topoRepo;


    @Autowired
    private UtilisateurService userSvc;


    @RequestMapping("/cmt1")
    @ResponseBody
    public String comment() {
        return cmt.getCommentaireById(1).getContent();
    }

    /**
     * Affiche la page des topos
     * @param model
     * @return
     */
    @RequestMapping(value = "/topo", method = RequestMethod.GET)
    public String displayTopo(@RequestParam(name = "user", defaultValue = "") String user,
                              @RequestParam(name = "page", defaultValue = "0") int page,
                              Model model) {

        Page<Topo> pagesTopo = topoSvc.findAllTopo(PageRequest.of(page, 10));
        model.addAttribute("topos",pagesTopo.getContent());
        model.addAttribute("arrayNbPagesTopo", new int[pagesTopo.getTotalPages()]);
        model.addAttribute("currentPageTopo", page);
        model.addAttribute("currentUser", userSvc.getUser(user));
        model.addAttribute("nbPagesTopo", pagesTopo.getTotalPages());

        return "topo/galeryTopo";
    }

    /**
     * Affiche le formulaire d'ajout de Topo
     *
     * @return
     */
    @RequestMapping(value = "/atopo", method = RequestMethod.GET)
    public ModelAndView showFormTopo(@RequestParam("user") String user, Model model) {
        model.addAttribute("currentUser", userSvc.getUserbyUserName(user));
        return new ModelAndView("topo/addtopo", "atopo", new Topo());
    }


    /**
     * Permet d'ajouter un Topo
     *
     * @param topo
     * @return la page en cours
     */
    @RequestMapping(value = "/addtopo", method = RequestMethod.POST)
    public ModelAndView saveTopo(@ModelAttribute("atopo") Topo topo) {
        topoSvc.createTopo(topo);
        return new ModelAndView("redirect:/topo");
    }


    @RequestMapping(value = "/mytopo", method = RequestMethod.GET)
    public String displayUserTopo(@RequestParam("user") String user,
                                  @RequestParam(name = "pageTopo", defaultValue = "0") int pageTopo,
                                  @RequestParam(name = "pageTopoShare", defaultValue = "0") int pageTopoShare,
                                  @ModelAttribute("currentUser") Utilisateur currentlyUser,
                                  Model model) {

        currentlyUser = userSvc.getUser(user);

        Page<Topo> pagesTopo = topoSvc.findAllByUserName(user, PageRequest.of(pageTopo, 5));
        Page<Topo> pagesTopoShare = topoSvc.findAllByCurrentlyUser(currentlyUser.getUtilisateurId(), PageRequest.of(pageTopoShare, 5));


        model.addAttribute("user", userSvc.getUser(user));
        model.addAttribute("topos", pagesTopo.getContent());
        model.addAttribute("tShare",pagesTopoShare.getContent());
        model.addAttribute("arrayNbPagesTopo", new int[pagesTopo.getTotalPages()]);
        model.addAttribute("arrayNbPagesTopoShare", new int[pagesTopoShare.getTotalPages()]);
        model.addAttribute("currentPageTopo", pageTopo);
        model.addAttribute("currentPageTopoShare", pageTopoShare);


        model.addAttribute("nbPagesTopo", pagesTopo.getTotalPages());
        model.addAttribute("nbPagesTopoShare", pagesTopoShare.getTotalPages());




        return "topo/mytopo";
    }

    @RequestMapping(value = "/mytopo", method = RequestMethod.POST)
    public ModelAndView shareTopo(@RequestParam("user") String user,
                            @RequestParam(name = "action", defaultValue = "") String action,
                            @ModelAttribute("topo") Topo topo) {

        topoSvc.updateTopo(action, topo.getReserve(), user, topo.getTopoId());

        return new ModelAndView( "redirect:/mytopo?user=" + user);
    }

    /**
     * Affiche la page de réservation des topo
     * @param model
     * @return
     */
    @RequestMapping(value = "/displaytopoavailable", method = RequestMethod.GET)
    public String displayTopoReservation(@RequestParam(name="page", defaultValue = "0") int page,
                                         @RequestParam("user") String user,
                                         @RequestParam(name="available", defaultValue = "true") Boolean available,
                                         Model model) {

        Page<Topo> pagesTopo = topoRepo.findAllByAvailableIsTrue(available,  PageRequest.of(page, 5));


        model.addAttribute("topos",pagesTopo.getContent());
        model.addAttribute("arrayNbPagesTopo", new int[pagesTopo.getTotalPages()]);
        model.addAttribute("currentPageTopo", page);
        model.addAttribute("currentUser", userSvc.getUser(user));
        model.addAttribute("nbPagesTopo", pagesTopo.getTotalPages());

        return "topo/displaytopoavailable";
    }

    /**
     * Affiche la page de réservation des topo
     * @return
     */
    @RequestMapping(value = "/reservetopo", method = RequestMethod.POST)
    public ModelAndView reserveTopo(@RequestParam("userId") int userId,
                              @RequestParam("topoId") int topoId) {

            topoRepo.setTopoUserNameByUserId(userId, topoId);
            topoRepo.setTopoUnvailableById(false, topoId);
            topoRepo.setTopoReserveUserIdByTopoId(true, topoId);

            return new ModelAndView( "redirect:/displaytopoavailable?user=" +  userSvc.findByUtilisateurId(userId).getUtilisateurId());
    }




}