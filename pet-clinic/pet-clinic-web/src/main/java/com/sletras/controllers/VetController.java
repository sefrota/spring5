package com.sletras.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by sergioletras on 12/02/19.
 */
@Controller
public class VetController {

    @RequestMapping(path = {"vets", "vets.html"})
    public String listVets(){
        return "vets/index";
    }
}
