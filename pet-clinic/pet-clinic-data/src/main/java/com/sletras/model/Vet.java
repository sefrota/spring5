package com.sletras.model;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by sergioletras on 07/02/19.
 */
public class Vet extends Person {

    private Set<Specialty> specialties;

    public Set<Specialty> getSpecialties() {
        return specialties;
    }

    public void setSpecialties(Set<Specialty> specialties) {
        this.specialties = specialties;
    }

    public Vet() {
        super();
    }

    public Vet(String firstName, String lastName) {
        super(firstName, lastName);
    }

    public void addSpecialty(Specialty specialty){
        if(specialties == null)
            specialties = new HashSet<>();
        specialties.add(specialty);
    }

    public void removeSpecialty(Specialty specialty){
        if(specialties == null)
            return;
        specialties.remove(specialty);
    }
}
