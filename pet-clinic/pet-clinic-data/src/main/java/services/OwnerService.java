package services;

import model.Owner;

import java.util.Set;

/**
 * Created by sergioletras on 09/02/19.
 */
public interface OwnerService {

    Owner findById(Long id);

    Set<Owner> findAll();

    Owner save(Owner owner);

    Owner findByLastName(String lastName);
}
