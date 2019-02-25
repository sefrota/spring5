package com.sletras.services;

import com.sletras.services.map.PetServiceMap;
import com.sletras.services.map.PetTypeServiceMap;
import org.junit.Before;
import com.sletras.services.map.OwnerServiceMap;
import org.junit.Test;

/**
 * Created by sergioletras on 12/02/19.
 */
public class OwnerServiceMapTest {

    OwnerServiceMap ownerServiceMap;
    PetTypeServiceMap petTypeService;
    PetServiceMap petService;

    @Before
    public void setup(){
        ownerServiceMap = new OwnerServiceMap(petService, petTypeService);
    }

    @Test
    public void test(){
        System.out.print("A");
    }
}
