package services.map;

import services.CrudService;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * Created by sergioletras on 11/02/19.
 */
public abstract class AbstractServiceMap<T, ID> implements CrudService<T, ID>{

    protected Map<ID, T> map = new HashMap<>();

    public Set findAll() {
        return new HashSet<>(map.values());
    }

    public T findById(ID id) {
        return map.get(id);
    }

    public T save(T object) {
        map.put(null, object);
        return object;
    }

    public void deleteById(ID id) {
        map.remove(id);
    }

    public void delete(T object){
        map.entrySet().removeIf(entry -> entry.getValue().equals(object));
    }
}
