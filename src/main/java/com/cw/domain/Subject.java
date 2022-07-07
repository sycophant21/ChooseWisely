package com.cw.domain;

import com.cw.domain.id.SubjectId;
import com.cw.helper.domain.Metadata;

import javax.persistence.Embedded;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

@Entity
public class Subject {
    @EmbeddedId
    private SubjectId subjectId;
    private String name;
    @Embedded
    private Metadata metadata;

    public Subject() {
    }

    public Subject(SubjectId subjectId, String name, Metadata metadata) {
        this.subjectId = subjectId;
        this.name = name;
        this.metadata = metadata;
    }

    public SubjectId getSubjectId() {
        return subjectId;
    }

    public Subject setSubjectId(SubjectId subjectId) {
        this.subjectId = subjectId;
        return this;
    }

    public String getName() {
        return name;
    }

    public Subject setName(String name) {
        this.name = name;
        return this;
    }

    public Metadata getMetadata() {
        return metadata;
    }

    public Subject setMetadata(Metadata metadata) {
        this.metadata = metadata;
        return this;
    }
}
