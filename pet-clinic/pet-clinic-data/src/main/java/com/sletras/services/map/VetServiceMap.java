package com.sletras.services.map;

import com.sletras.model.Vet;
import com.sletras.services.SpecialtyService;
import com.sletras.services.VetService;
import org.springframework.stereotype.Service;

/**
 * Created by sergioletras on 12/02/19.
 */
@Service
public class VetServiceMap extends BaseEntityServiceMap<Vet, Long> implements VetService {

    private SpecialtyService specialtyService;

    public VetServiceMap(SpecialtyService specialtyService) {
        this.specialtyService = specialtyService;
    }

    @Override
    public Vet save(Vet vet) {
        if(vet != null){
            if(vet.getSpecialties() != null){
                vet.getSpecialties().forEach(specialty -> {
                    specialtyService.save(specialty);
                });
            }
            super.save(vet);
        }
        return vet;
    }
}
