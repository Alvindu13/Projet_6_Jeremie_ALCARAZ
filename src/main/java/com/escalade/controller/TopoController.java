package com.escalade.controller;

import com.escalade.data.model.Topo;
import com.escalade.data.repository.TopoRepository;
import com.escalade.svc.contracts.CommentaireService;
import com.escalade.svc.contracts.TopoService;
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
    public String displayUserTopo(@RequestParam("user") String user, Model model) {
        model.addAttribute("topos",topoSvc.listTopoByUser(user));
        return "topo/mytopo";
    }

    @RequestMapping(value = "/mytopo", method = RequestMethod.POST)
    public String shareTopo(@RequestParam("user") String user, @ModelAttribute("topo") Topo topo) {
        topo.setAvailable(true);
        topoSvc.updateTopo(topo.isAvailable(), user, topo.getName());
        return "topo/mytopo";
    }

    /**
     * Affiche la page de réservation des topo
     * @param model
     * @return
     */
    @RequestMapping(value = "/displaytopoavailable", method = RequestMethod.GET)
    public String displayTopoReservation(@RequestParam(name="page", defaultValue = "0") int page,
                                         @RequestParam(name="available", defaultValue = "true") Boolean available,
                                         Model model) {
        //Page<Topo> pagesTopo = topoRepo.findAllByAvailableIsTrue(available,  PageRequest.of(page, 5));
        //model.addAttribute("topos",pagesTopo.getContent());
        //model.addAttribute("pages", new int[pagesTopo.getTotalPages()]);
        //model.addAttribute("currentPage", page);

        model.addAttribute("topos", topoSvc.findAllByAvailableIsTrueOrderByAvailables(available));
        return "topo/displaytopoavailable";
    }

    /**
     * Affiche la page de réservation des topo
     * @param model
     * @return
     */
    @RequestMapping(value = "/reservetopo", method = RequestMethod.GET)
    public String reserveTopo(@RequestParam("user") String user,
                              @RequestParam("topoId") int topoId,
                              Model model) {


        return "topo/reservetopo";
    }




}