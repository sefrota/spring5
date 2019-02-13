package com.sletras.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by sergioletras on 13/02/19.
 */
@Controller
public class OwnerController {

    @RequestMapping(path = {"owners", "owners.html"})
    public String listOwners(){
        return "owners/index";
    }
}
