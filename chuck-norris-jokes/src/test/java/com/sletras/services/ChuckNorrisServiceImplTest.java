package com.sletras.services;

import org.junit.Before;
import org.junit.Test;

/**
 * Created by sergioletras on 11/02/19.
 */
public class ChuckNorrisServiceImplTest {

    ChuckNorrisService chuckNorrisService;

    @Before
    public void setup(){
        chuckNorrisService = new ChuckNorrisServiceImpl();
    }

    @Test
    public void testGetQuote(){
        System.out.println(chuckNorrisService.getJoke());
    };
}
