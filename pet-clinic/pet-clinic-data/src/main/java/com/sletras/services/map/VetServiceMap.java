package com.sletras.services.map;

import com.sletras.model.Vet;
import com.sletras.services.VetService;
import org.springframework.stereotype.Service;

/**
 * Created by sergioletras on 12/02/19.
 */
@Service
public class VetServiceMap extends BaseEntityServiceMap<Vet, Long> implements VetService {
}
