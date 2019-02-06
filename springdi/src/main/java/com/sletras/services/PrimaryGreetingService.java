package com.sletras.services;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/**
 * Created by sergioletras on 05/02/19.
 */
@Service
@Primary
@Profile("en")
public class PrimaryGreetingService implements GreetingService {

    public static final String HELLO_GURUS = "Hello Primary Gurus";

    @Override
    public String sayHello() {
        return HELLO_GURUS;
    }
}
