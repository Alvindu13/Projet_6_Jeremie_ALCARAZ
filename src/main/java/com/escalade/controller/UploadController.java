package com.escalade.controller;

import javax.servlet.http.HttpServletRequest;

import com.escalade.data.model.Files;
import com.escalade.svc.contracts.FilesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.commons.CommonsMultipartFile;
import org.springframework.web.servlet.ModelAndView;

/**
 * Handles requests for the file upload page.
 */
@Controller
public class UploadController {

    @Autowired
    private FilesService fSvc;

    @RequestMapping(value = "/doUpload", method = RequestMethod.POST)
    public ModelAndView handleFileUpload(HttpServletRequest request,
                                         @RequestParam("user") String user,
                                         @RequestParam CommonsMultipartFile[] fileUpload,
                                         @ModelAttribute("files") Files files) throws Exception {

        if (fileUpload != null && fileUpload.length > 0) {
            for (CommonsMultipartFile aFile : fileUpload){
                files.setFileName(aFile.getOriginalFilename());
                files.setData(aFile.getBytes());
                fSvc.createFiles(files);
            }
        }

        return new ModelAndView("redirect:/mytopo?user=" + user);
    }
}
