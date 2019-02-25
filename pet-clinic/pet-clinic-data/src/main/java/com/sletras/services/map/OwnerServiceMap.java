package com.sletras.services.map;

import com.sletras.model.Owner;
import com.sletras.services.OwnerService;
import com.sletras.services.PetService;
import com.sletras.services.PetTypeService;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * Created by sergioletras on 11/02/19.
 */
@Service
public class OwnerServiceMap extends BaseEntityServiceMap<Owner, Long> implements OwnerService {

    private PetService petService;
    private PetTypeService petTypeService;

    public OwnerServiceMap(PetService petService, PetTypeService petTypeService) {
        this.petService = petService;
        this.petTypeService = petTypeService;
    }

    @Override
    public Owner save(Owner owner) {
        if(owner != null){
            if(owner.getPets() != null){
                owner.getPets().forEach(pet -> {
                    if(pet.getPetType() != null){
                        petTypeService.save(pet.getPetType());
                    }else{
                        throw new RuntimeException("Pet type is required for pet");
                    }
                    pet.setId(petService.save(pet).getId());
                });
            }
        }
        return owner;
    }

    @Override
    public Owner findByLastName(String lastName) {
        return map.entrySet().stream().map(Map.Entry::getValue)
                .filter(owner -> owner.getLastName().equals(lastName)).findFirst().orElse(null);
    }
}
