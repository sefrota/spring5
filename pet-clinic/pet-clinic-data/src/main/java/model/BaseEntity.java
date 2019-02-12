package model;

import java.io.Serializable;

/**
 * Created by sergioletras on 11/02/19.
 */
public class BaseEntity<ID> implements Serializable {

    private ID id;

    public ID getId() {
        return id;
    }

    public void setId(ID id) {
        this.id = id;
    }
}
