package com.sletras.services;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/**
 * Created by sergioletras on 05/02/19.
 */
@Service
@Primary
@Profile({"es", "default"})
public class PrimarySpanishGreetingService implements GreetingService{
    @Override
    public String sayHello() {
        return "Servicio de Saludo Primario";
    }
}
