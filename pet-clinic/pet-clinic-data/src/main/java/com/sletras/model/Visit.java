package com.sletras.model;

import java.time.LocalDate;

/**
 * Created by sergioletras on 25/02/19.
 */
public class Visit extends BaseEntity<Long> {

    private LocalDate date;
    private String description;
    private Pet pet;

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    public Visit(LocalDate date) {
        this.date = date;
    }
}
