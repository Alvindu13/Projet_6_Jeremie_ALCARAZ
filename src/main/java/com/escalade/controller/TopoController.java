package com.escalade.controller;

import com.escalade.data.model.Topo;
import com.escalade.svc.contracts.CommentaireService;
import com.escalade.svc.contracts.TopoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class TopoController {


    @Autowired
    CommentaireService cmt;

    @Autowired
    TopoService dao;


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
    public String displayTopo(Model model) {
        //List<Topo> topos = topoDao.listTopo();
        //System.out.println(topos.size());
        //model.addAttribute("topos", topos);
        model.addAttribute("topos", dao.listTopo());
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
        dao.createTopo(topo);
        return "topo/addtopo";
    }

}