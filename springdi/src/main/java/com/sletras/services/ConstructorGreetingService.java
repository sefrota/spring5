package com.sletras.services;

import org.springframework.stereotype.Service;

/**
 * Created by sergioletras on 05/02/19.
 */
@Service
public class ConstructorGreetingService implements GreetingService {

    public static final String HELLO_GURUS = "Hello Constructor Gurus";

    @Override
    public String sayHello() {
        return HELLO_GURUS;
    }
}
