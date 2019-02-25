package com.sletras.bootstrap;

import com.sletras.model.Owner;
import com.sletras.model.PetType;
import com.sletras.model.Vet;
import com.sletras.services.OwnerService;
import com.sletras.services.PetTypeService;
import com.sletras.services.VetService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * Created by sergioletras on 14/02/19.
 */
@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;
    private final PetTypeService petTypeService;

    public DataLoader(OwnerService ownerService, VetService vetService, PetTypeService petTypeService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
        this.petTypeService = petTypeService;
    }

    @Override
    public void run(String... strings) throws Exception {

        PetType dog = new PetType();
        dog.setName("Dog");

        petTypeService.save(dog);

        PetType cat = new PetType();
        cat.setName("Cat");

        petTypeService.save(cat);

        Owner owner1 = new Owner();
        owner1.setFirstName("John");
        owner1.setLastName("Smith");

        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setFirstName("Anthony");
        owner2.setLastName("Sanders");

        ownerService.save(owner2);

        System.out.println("Loaded owners...");

        Vet vet1 = new Vet();
        vet1.setFirstName("Sonia");
        vet1.setLastName("Denison");

        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setFirstName("Lisa");
        vet2.setLastName("Simpson");

        vetService.save(vet2);


        System.out.println("Loaded vets...");

    }
}
