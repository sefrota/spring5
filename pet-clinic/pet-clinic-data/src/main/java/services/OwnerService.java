package services;

import model.Owner;

import java.util.Set;

/**
 * Created by sergioletras on 09/02/19.
 */
public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName(String lastName);
}
