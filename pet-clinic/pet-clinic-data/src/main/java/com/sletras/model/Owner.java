package com.sletras.model;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by sergioletras on 07/02/19.
 */
public class Owner extends Person {

    private Set<Pet> pets;

    public Owner() {
        super();
    }

    public Owner(String firstName, String lastName) {
        super(firstName, lastName);
    }

    public Set<Pet> getPets() {
        return pets;
    }

    public void setPets(Set<Pet> pets) {
        this.pets = pets;
    }

    public void addPet(Pet pet){
        if (pets == null)
            pets = new HashSet<>();
        pets.add(pet);
    }

    public void removePet(Pet pet){
        if (pets == null)
            return;
        pets.remove(pet);
    }


}
