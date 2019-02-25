package com.sletras.services;

import com.sletras.model.PetType;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by sergioletras on 25/02/19.
 */
public interface PetTypeService extends CrudRepository<PetType, Long> {
}
