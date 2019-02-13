package com.sletras.services;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by sergioletras on 11/02/19.
 */
public class ChuckNorrisServiceImplTest {

    ChuckNorrisService chuckNorrisService;

    @Before
    public void setup(){
        chuckNorrisService = new ChuckNorrisServiceImpl(new ChuckNorrisQuotes());
    }

    @Test
    public void testGetQuote(){
        System.out.println(chuckNorrisService.getJoke());
    };
}
