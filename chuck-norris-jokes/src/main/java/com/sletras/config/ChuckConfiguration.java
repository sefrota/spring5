package com.sletras.config;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by sergioletras on 13/02/19.
 */
//@Configuration
public class ChuckConfiguration {

    //Java Configuration for Spring Beans
//    @Bean
    public ChuckNorrisQuotes chuckNorrisQuotes(){
        return new ChuckNorrisQuotes();
    }
}
