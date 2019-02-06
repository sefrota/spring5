package com.sletras.services;

import org.springframework.stereotype.Service;

/**
 * Created by sergioletras on 05/02/19.
 */
@Service
public class SetterGreetingService implements GreetingService {

    public static final String HELLO_GURUS = "Hello Setter Gurus";

    @Override
    public String sayHello() {
        return HELLO_GURUS;
    }
}
