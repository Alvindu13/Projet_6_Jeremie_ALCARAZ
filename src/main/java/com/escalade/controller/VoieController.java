package com.escalade.controller;

import com.escalade.svc.contracts.VoieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class VoieController {

    @Autowired
    private VoieService svcV;


    @RequestMapping(value = "/voie", method = RequestMethod.GET)
    public String displayVoie(Model model, @RequestParam("secteurId") int secteurId) {
        model.addAttribute("voies", svcV.listVoiesBySecId(secteurId));
        return "voie/voie";
    }
}
