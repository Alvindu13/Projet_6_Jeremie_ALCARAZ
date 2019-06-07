package com.escalade.controller;

import com.escalade.data.model.Site;
import com.escalade.data.repository.SiteRepository;
import com.escalade.svc.contracts.SiteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class SearchController {

    @Autowired
    private SiteRepository svcSite;

    @GetMapping("/search")
    public String chercher(@RequestParam(name="motCle", defaultValue = "") String mc,
                           @RequestParam(name="page", defaultValue = "0") int page,
                           Model model) {
        Page<Site> pageSites = svcSite.findAllSiteByCritera(mc, PageRequest.of(page, 5));
        model.addAttribute("sites",pageSites.getContent());
        model.addAttribute("pages", new int[pageSites.getTotalPages()]);
        model.addAttribute("motCle", mc);
        model.addAttribute("currentPage", page);
        return "search";
    }


}
