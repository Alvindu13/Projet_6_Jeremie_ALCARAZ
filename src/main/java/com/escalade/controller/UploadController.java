package com.escalade.controller;

import javax.servlet.http.HttpServletRequest;

import com.escalade.data.model.Files;
import com.escalade.svc.contracts.FilesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

/**
 * Handles requests for the file upload page.
 */
@Controller
public class UploadController {

    @Autowired
    private FilesService fSvc;

    @RequestMapping(value = "/up1", method = RequestMethod.GET)
    public String showUploadForm(HttpServletRequest request) {
        return "upload/upload";
    }

    @RequestMapping(value = "/doUpload", method = RequestMethod.POST)
    public String handleFileUpload(HttpServletRequest request,
                                   @RequestParam CommonsMultipartFile[] fileUpload) throws Exception {

        if (fileUpload != null && fileUpload.length > 0) {
            for (CommonsMultipartFile aFile : fileUpload){

                System.out.println("Saving file: " + aFile.getOriginalFilename());

                Files uploadFile = new Files();
                uploadFile.setFileName(aFile.getOriginalFilename());
                uploadFile.setData(aFile.getBytes());
                fSvc.createFiles(uploadFile);
            }
        }

        return "upload/success";
    }
}
