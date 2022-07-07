package com.cw.domain.id;

import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class SubjectId implements Serializable {

    private static final long serialVersionUID = 1L;
    private String id;

    public SubjectId(String id) {
        this.id = id;
    }

    public SubjectId() {
    }

    public String getId() {
        return id;
    }

    public SubjectId setId(String id) {
        this.id = id;
        return this;
    }
}
