package com.sletras.controllers;

import com.sletras.services.ChuckNorrisService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by sergioletras on 11/02/19.
 */
@Controller
public class ChuckNorrisController {

    private ChuckNorrisService chuckNorrisService;

    public ChuckNorrisController(ChuckNorrisService chuckNorrisService) {
        this.chuckNorrisService = chuckNorrisService;
    }

    @RequestMapping(path = {"", "/"})
    public String getJoke(Model model){
        model.addAttribute("joke", chuckNorrisService.getJoke());

        return "jokes";
    }
}
