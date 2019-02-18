package com.sletras.services.map;

import com.sletras.model.BaseEntity;
import com.sletras.services.CrudService;

import java.util.*;

/**
 * Created by sergioletras on 11/02/19.
 */
public abstract class AbstractServiceMap<T extends BaseEntity, ID extends Long> implements CrudService<T, ID>{

    protected Map<Long, T> map = new HashMap<>();

    public Set<T> findAll() {
        return new HashSet<>(map.values());
    }

    public T findById(ID id) {
        return map.get(id);
    }

    public T save(T object) {
        if(object == null)
            throw new RuntimeException("Object is null");

        if(object.getId() == null)
            object.setId(getNextId());

        map.put(getNextId(), object);

        return object;
    }

    public void deleteById(ID id) {
        map.remove(id);
    }

    public void delete(T object){
        map.entrySet().removeIf(entry -> entry.getValue().equals(object));
    }

    public Long getNextId(){
        try{
            return Collections.max(map.keySet()) + 1 ;
        }catch (NoSuchElementException e){
            return 1L;
        }
    }
}
