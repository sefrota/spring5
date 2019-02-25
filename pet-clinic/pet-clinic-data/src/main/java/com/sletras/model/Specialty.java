package com.sletras.model;

/**
 * Created by sergioletras on 25/02/19.
 */
public class Specialty extends BaseEntity<Long> {

    private String description;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
