package com.escalade.web.controller;

import com.escalade.svc.contracts.WayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class WayController {

    @Autowired
    private WayService svcW;

    /**
     * Affiche toutes les voies
     * @param model
     * @param secteurId filtre
     * @return
     */
    @RequestMapping(value = "/way", method = RequestMethod.GET)
    public String displayWay(Model model, @RequestParam("secteurId") int secteurId) {
        model.addAttribute("way", svcW.listWayBySecId(secteurId));
        return "way/way";
    }
}
