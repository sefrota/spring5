package com.sletras.bootstrap;

import com.sletras.model.*;
import com.sletras.services.OwnerService;
import com.sletras.services.PetTypeService;
import com.sletras.services.VetService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

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

        int size = petTypeService.findAll().size();

        if(size == 0)
            loadData();

    }

    private void loadData() {
        PetType dog = new PetType();
        dog.setName("Dog");

        PetType dogType = petTypeService.save(dog);

        PetType cat = new PetType();
        cat.setName("Cat");

        PetType catType = petTypeService.save(cat);

        Owner owner1 = new Owner();
        owner1.setFirstName("John");
        owner1.setLastName("Smith");
        owner1.setAddress("123 Brickerel");
        owner1.setCity("Miami");
        owner1.setTelephone("24252151");

        Pet mike = new Pet();
        mike.setName("Mike");
        mike.setPetType(dogType);
        mike.setOwner(owner1);
        mike.setBirthday(LocalDate.of(2002, 5, 15));

        owner1.addPet(mike);

        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setFirstName("Anthony");
        owner2.setLastName("Sanders");
        owner2.setAddress("4151 Winston");
        owner2.setCity("New Jersey");
        owner2.setTelephone("525252522");

        Pet katy = new Pet();
        katy.setName("Katy");
        katy.setPetType(catType);
        katy.setOwner(owner2);
        katy.setBirthday(LocalDate.of(2005, 2, 22));

        owner2.addPet(katy);

        ownerService.save(owner2);

        System.out.println("Loaded owners...");

        Vet vet1 = new Vet();
        vet1.setFirstName("Sonia");
        vet1.setLastName("Denison");

        Specialty specialty = new Specialty();
        specialty.setDescription("Doggies");

        vet1.addSpecialty(specialty);

        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setFirstName("Lisa");
        vet2.setLastName("Simpson");

        Specialty specialty2 = new Specialty();
        specialty.setDescription("Kitties");

        vet2.addSpecialty(specialty2);

        vetService.save(vet2);


        System.out.println("Loaded vets...");
    }
}
