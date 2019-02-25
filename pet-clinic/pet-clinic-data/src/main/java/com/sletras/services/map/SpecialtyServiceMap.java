package com.sletras.services.map;

import com.sletras.model.Specialty;
import com.sletras.services.SpecialtyService;
import org.springframework.stereotype.Service;

/**
 * Created by sergioletras on 25/02/19.
 */
@Service
public class SpecialtyServiceMap extends BaseEntityServiceMap<Specialty, Long> implements SpecialtyService {
}
