package com.sletras.model;

import java.io.Serializable;

/**
 * Created by sergioletras on 11/02/19.
 */
public class BaseEntity<ID extends Long> implements Serializable {

    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
