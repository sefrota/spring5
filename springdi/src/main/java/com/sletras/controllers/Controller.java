package com.sletras.controllers;

import com.sletras.services.GreetingService;

/**
 * Created by sergioletras on 04/02/19.
 */
@org.springframework.stereotype.Controller
public class Controller {

    private GreetingService greetingService;


    public Controller(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello(){
        return greetingService.sayHello();
    }
}
