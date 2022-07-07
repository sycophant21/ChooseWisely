package com.cw.domain.id;

import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class BachelorId implements Serializable {

    private static final long serialVersionUID = 1L;
    private String id;

    public BachelorId(String id) {
        this.id = id;
    }

    public BachelorId() {
    }

    public String getId() {
        return id;
    }

    public BachelorId setId(String id) {
        this.id = id;
        return this;
    }
}
