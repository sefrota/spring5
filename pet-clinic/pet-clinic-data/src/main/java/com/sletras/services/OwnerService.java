package com.sletras.services;

import com.sletras.model.Owner;

/**
 * Created by sergioletras on 09/02/19.
 */
public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName(String lastName);
}
