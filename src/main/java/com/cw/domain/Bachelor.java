package com.cw.domain;

import com.cw.domain.id.BachelorId;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;

@Entity
public class Bachelor {
    @EmbeddedId
    private BachelorId id;
    private String name;
    @Lob
    private byte[] description;


}
