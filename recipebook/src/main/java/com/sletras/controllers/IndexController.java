package com.sletras.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by sergioletras on 20/02/19.
 */
@Controller
public class IndexController {

    @RequestMapping({"", "/", "/index"})
    public String index(){
        System.out.print("helo");
        return "index";
    }

}
