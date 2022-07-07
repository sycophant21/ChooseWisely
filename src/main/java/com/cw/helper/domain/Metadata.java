package com.cw.helper.domain;

import javax.persistence.*;
import java.time.LocalDateTime;

@Embeddable
public class Metadata {
    @Temporal(TemporalType.TIMESTAMP)
    @Column(updatable = false)
    private LocalDateTime createdAt;
    @Temporal(TemporalType.TIMESTAMP)
    private LocalDateTime updatedAt;
    @Embedded
    private ActivityStatus activityStatus;

    public Metadata(LocalDateTime createdAt, LocalDateTime updatedAt, ActivityStatus activityStatus) {
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.activityStatus = activityStatus;
    }

    public Metadata() {
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public Metadata setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }

    public Metadata setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    public ActivityStatus getActivityStatus() {
        return activityStatus;
    }

    public Metadata setActivityStatus(ActivityStatus activityStatus) {
        this.activityStatus = activityStatus;
        return this;
    }
}
