package com.sletras.controllers;

import com.sletras.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

/**
 * Created by sergioletras on 04/02/19.
 */
@org.springframework.stereotype.Controller
public class SetterInjectedController {


    private GreetingService greetingService;

    public String sayHello(){
        return greetingService.sayHello();
    }

    @Autowired
    public void setGreetingService(@Qualifier("setterGreetingService") GreetingService greetingService) {
        this.greetingService = greetingService;
    }
}
