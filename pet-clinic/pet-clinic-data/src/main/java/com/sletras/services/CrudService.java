package com.sletras.services;

import java.util.Set;

/**
 * Created by sergioletras on 11/02/19.
 */
public interface CrudService<T, ID> {

    Set<T> findAll();

    T findById(ID id);

    T save(T object);

    T save(ID id, T object);

    void delete(T object);

    void deleteById(ID id);

}
