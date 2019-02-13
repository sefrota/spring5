package com.sletras.services;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

/**
 * Created by sergioletras on 11/02/19.
 */
@Service
public class ChuckNorrisServiceImpl implements ChuckNorrisService{

    private ChuckNorrisQuotes chuckNorrisQuotes;

    public ChuckNorrisServiceImpl(ChuckNorrisQuotes chuckNorrisQuotes) {
        this.chuckNorrisQuotes = chuckNorrisQuotes;
    }

    @Override
    public String getJoke() {
        return chuckNorrisQuotes.getRandomQuote();
    }
}
