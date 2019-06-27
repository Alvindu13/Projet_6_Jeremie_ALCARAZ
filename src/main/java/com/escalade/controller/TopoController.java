package com.escalade.controller;

import com.escalade.data.model.Topo;
import com.escalade.data.model.Utilisateur;
import com.escalade.data.repository.TopoRepository;
import com.escalade.data.repository.UtilisateurRepository;
import com.escalade.svc.contracts.CommentaireService;
import com.escalade.svc.contracts.TopoService;
import com.escalade.svc.contracts.UtilisateurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class TopoController {


    @Autowired
    CommentaireService cmt;

    @Autowired
    TopoService topoSvc;

    @Autowired
    private TopoRepository topoRepo;

    @Autowired
    private UtilisateurRepository userRepo;

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
    public String displayTopo(@RequestParam("user") String user, Model model) {
        //List<Topo> topos = topoDao.listTopo();
        //System.out.println(topos.size());
        //model.addAttribute("topos", topos);
        model.addAttribute("topos", topoSvc.listTopo());
        return "topo/galeryTopo";
    }

    /**
     * Affiche le formulaire d'ajout de Topo
     *
     * @return
     */
    @RequestMapping(value = "/atopo", method = RequestMethod.GET)
    public ModelAndView showFormTopo() {
        return new ModelAndView("topo/addtopo", "atopo", new Topo());
    }


    /**
     * Permet d'ajouter un Topo
     *
     * @param topo
     * @return la page en cours
     */
    @RequestMapping(value = "/addtopo", method = RequestMethod.POST)
    public String saveTopo(@ModelAttribute("atopo") Topo topo) {
        topoSvc.createTopo(topo);
        return "topo/addtopo";
    }


    @RequestMapping(value = "/mytopo", method = RequestMethod.GET)
    public String displayUserTopo(@RequestParam("user") String user,
                                  @ModelAttribute("currentUser") Utilisateur currentlyUser,
                                  Model model) {


        currentlyUser = userRepo.findByUserName(user);

        model.addAttribute("user", userRepo.findByUserName(user));
        model.addAttribute("topos",topoSvc.listTopoByUser(user));
        model.addAttribute("tShare",topoSvc.findAllByCurrentlyUser(currentlyUser.getUtilisateurId()));






        return "topo/mytopo";
    }

    @RequestMapping(value = "/mytopo", method = RequestMethod.POST)
    public String shareTopo(@RequestParam("user") String user,
                            @RequestParam("action") String action,
                            @ModelAttribute("topo") Topo topo) {

        //System.out.println(action);
        topoSvc.updateTopo(action, topo.getReserve(), user, topo.getTopoId());


        //topoSvc.updateTopo(topo.isAvailable(), user, topo.getTopoId());

        return "topo/mytopo";
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
        //Page<Topo> pagesTopo = topoRepo.findAllByAvailableIsTrue(available,  PageRequest.of(page, 5));
        //model.addAttribute("topos",pagesTopo.getContent());
        //model.addAttribute("pages", new int[pagesTopo.getTotalPages()]);
        //model.addAttribute("currentPage", page);


        model.addAttribute("currentUser", userRepo.findByUserName(user));
        model.addAttribute("topos", topoSvc.findAllByAvailableIsTrueOrderByAvailables(available));


        return "topo/displaytopoavailable";
    }

    /**
     * Affiche la page de réservation des topo
     * @return
     */
    @RequestMapping(value = "/reservetopo", method = RequestMethod.POST)
    public String reserveTopo(@RequestParam("userId") int userId,
                              @RequestParam("topoId") int topoId) {

       topoRepo.setTopoUserNameByUserId(userId, topoId);
       topoRepo.setTopoUnvailableById(false, topoId);
       topoRepo.setTopoReserveUserIdByTopoId(true, topoId);


        return "topo/mytopo";
    }




}