package services;

import model.Pet;

import java.util.Set;

/**
 * Created by sergioletras on 09/02/19.
 */
public interface PetService {

    Pet findById(Long id);

    Set<Pet> findAll();

    Pet save(Pet pet);
}
