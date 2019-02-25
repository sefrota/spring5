package com.sletras.services.map;

import com.sletras.model.Pet;
import com.sletras.services.PetService;
import org.springframework.stereotype.Service;

/**
 * Created by sergioletras on 12/02/19.
 */
@Service
public class PetServiceMap extends BaseEntityServiceMap<Pet, Long> implements PetService {
}
