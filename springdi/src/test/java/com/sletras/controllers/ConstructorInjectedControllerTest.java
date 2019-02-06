package com.sletras.controllers;

import com.sletras.services.GreetingServiceImpl;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static com.sletras.services.GreetingServiceImpl.HELLO_GURUS;

/**
 * Created by sergioletras on 05/02/19.
 */
public class ConstructorInjectedControllerTest {

    private ConstructorInjectedController constructorInjectedController;

    @Before
    public void setup(){
        this.constructorInjectedController = new ConstructorInjectedController(new GreetingServiceImpl());
    }

    @Test
    public void sayHello(){
        Assert.assertEquals(HELLO_GURUS, constructorInjectedController.sayHello());
    }
}
