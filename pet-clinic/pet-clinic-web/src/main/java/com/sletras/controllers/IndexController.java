package com.sletras.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by sergioletras on 12/02/19.
 */
@Controller
public class IndexController {

    @RequestMapping(path = {"", "/", "index", "index.html"})
    public String index(){
        return "index";
    }

    @RequestMapping(path = {"/oups", "/oups/"})
    public String oupsHandler(){
        return "notimplemented";
    }
}
