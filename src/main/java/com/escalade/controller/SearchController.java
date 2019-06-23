package com.escalade.controller;

import com.escalade.data.util.Search;
import com.escalade.data.model.Site;
import com.escalade.data.repository.SiteRepository;
import com.escalade.data.repository.VoieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


@Controller
public class SearchController {

    @Autowired
    private SiteRepository svcSite;

    @Autowired
    private VoieRepository svcVoie;

    @GetMapping("/search")
    public String chercher(@RequestParam(name="motCle", defaultValue = "") String mc,
                           @RequestParam(name="page", defaultValue = "0") int page,
                           Model model) {
        Page<Site> pageSites = svcSite.findAllSiteByCritera(mc, PageRequest.of(page, 5));
        model.addAttribute("sites",pageSites.getContent());
        model.addAttribute("pages", new int[pageSites.getTotalPages()]);
        model.addAttribute("motCle", mc);
        model.addAttribute("currentPage", page);


        return "search/search";
    }

    @GetMapping("/multisearch")
    public String chercherMultiple(Model model) {

        //model.addAttribute("test", svcSite.findAllByCotationBetween("4A", "5B"));
        return "search/multisearch";
    }


    @PostMapping("/multisearch")
    public String recupDataSearch(
            @ModelAttribute("searcher") Search search) {
        return "redirect:searchresult?location=" + search.getLocation() + "&cotation_minimum=" + search.getCotationMinimum() + "&cotation_maximum=" + search.getCotationMaximum() + "&nbsecteur=" +search.getNbSecteur();
    }

    @GetMapping("/searchresult")
    public String resultSearch(@RequestParam(name="location") String location,
                               @RequestParam(name="cotation_minimum") String cotationMini,
                               @RequestParam(name="cotation_maximum") String cotationMaxi,
                               @RequestParam(name="nbsecteur") Integer nbSecteur,
                               Model model) {


        /*String paramLocation = "";
        cotationMaxi = null;
        cotationMini = null;
        nbSecteur = null;


        if(!location.equals(null) && nbSecteur.equals(null) && cotationMaxi.equals(null) && cotationMini.equals(null)){
           paramLocation = "WHERE location = " + location;
        }


        String requestSQL = "SELECT * FROM SITE" + paramLocation ;
        model.addAttribute("sites", svcSite.testSQL(requestSQL));*/


        model.addAttribute("sites", svcSite.test2(location, cotationMini, cotationMaxi, nbSecteur));
        model.addAttribute("voies", svcVoie.findAllByFilterSite(location, cotationMini, cotationMaxi, nbSecteur));


        return "search/searchresult";
    }



}
