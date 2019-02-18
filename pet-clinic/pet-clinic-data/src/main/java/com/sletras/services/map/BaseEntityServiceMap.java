package com.sletras.services.map;

import com.sletras.model.BaseEntity;
import com.sletras.services.CrudService;

/**
 * Created by sergioletras on 11/02/19.
 */
public class BaseEntityServiceMap<T extends BaseEntity, ID extends Long> extends AbstractServiceMap<T, ID> implements CrudService<T, ID> {

}
