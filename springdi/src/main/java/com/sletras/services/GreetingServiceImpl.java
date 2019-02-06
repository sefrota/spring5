package com.sletras.services;

import org.springframework.stereotype.Service;

/**
 * Created by sergioletras on 04/02/19.
 */

@Service
public class GreetingServiceImpl implements GreetingService {

    public static final String HELLO_GURUS = "Hello Gurus";

    @Override
    public String sayHello() {
        return HELLO_GURUS;
    }
}
