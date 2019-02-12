package services.map;

import model.Owner;
import services.OwnerService;

import java.util.Map;

/**
 * Created by sergioletras on 11/02/19.
 */
public class OwnerServiceMap extends BaseEntityServiceMap<Owner, Long> implements OwnerService {

    @Override
    public Owner findByLastName(String lastName) {
        return map.entrySet().stream().map(Map.Entry::getValue)
                .filter(owner -> owner.getLastName().equals(lastName)).findFirst().orElse(null);
    }
}
