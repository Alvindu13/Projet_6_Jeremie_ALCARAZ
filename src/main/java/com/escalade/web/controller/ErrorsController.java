package com.escalade.web.controller;

import com.escalade.web.exception.CustomGenericException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ErrorsController {

    /*@RequestMapping(value = "/customer", method = RequestMethod.GET)
    public ModelAndView getPages() throws Exception {

        throw new CustomGenericException("E888", "This is custom message X");

    }*/

   /* @ExceptionHandler(CustomGenericException.class)
    public ModelAndView handleCustomException(CustomGenericException ex) {

        ModelAndView model = new ModelAndView("error/generic_error");
        model.addObject("exception", ex);
        return model;

    }*/

    /**
     * Génère des erreurs génériques pour toutes les exceptions web
     * @param ex
     * @return
     */
    @ExceptionHandler(Exception.class)
    public ModelAndView handleAllException(Exception ex) {

        ModelAndView model = new ModelAndView("error/exception_error");
        return model;

    }
}
