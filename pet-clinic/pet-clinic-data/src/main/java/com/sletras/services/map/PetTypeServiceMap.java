package com.sletras.services.map;

import com.sletras.model.PetType;
import com.sletras.services.PetTypeService;
import org.springframework.stereotype.Service;

/**
 * Created by sergioletras on 25/02/19.
 */
@Service
public class PetTypeServiceMap extends BaseEntityServiceMap<PetType, Long> implements PetTypeService {
}
