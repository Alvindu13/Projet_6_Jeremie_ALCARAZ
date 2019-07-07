package com.escalade.web.controller;

import com.escalade.data.model.Length;
import com.escalade.svc.contracts.WayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

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


    /**
     * Affiche le formulaire pour créer une voie
     *
     * @return
     */
    @RequestMapping(value = "/addlength", method = RequestMethod.GET)
    public String formSector(@RequestParam("wayId") int wayId,
                             @ModelAttribute("length") Length length,
                             Model model) {
        model.addAttribute("wayId", wayId);
        return "length/addlength";
    }

    /**
     * Créer une nouvelle voie
     *
     * @param wayId
     * @return
     */
    @RequestMapping(value = "/addlength", method = RequestMethod.POST)
    public ModelAndView createSector(@RequestParam("wayId") int wayId,
                                     @ModelAttribute("length") Length length) {
        lengthSvc.saveLength(length);
        return new ModelAndView("redirect:/length?wayId=" + wayId);
    }

}
