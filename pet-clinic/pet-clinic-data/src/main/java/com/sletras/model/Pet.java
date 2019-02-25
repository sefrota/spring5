package com.sletras.model;

import java.time.LocalDate;

/**
 * Created by sergioletras on 07/02/19.
 */
public class Pet extends BaseEntity {

    private PetType petType;
    private Owner owner;
    private LocalDate birthday;
    private String name;

    public Pet() {
    }

    public Pet(PetType petType, Owner owner, LocalDate birthday, String name) {
        this.petType = petType;
        this.owner = owner;
        this.birthday = birthday;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public PetType getPetType() {
        return petType;
    }

    public void setPetType(PetType petType) {
        this.petType = petType;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }
}
