package com.cw.helper.domain;

import javax.persistence.Embeddable;

@Embeddable
public class ActivityStatus {
    private boolean isActive;
    private Integer status;

    public ActivityStatus() {
    }

    public ActivityStatus(boolean isActive, Integer status) {
        this.isActive = isActive;
        this.status = status;
    }

    public boolean isActive() {
        return isActive;
    }

    public ActivityStatus setActive(boolean active) {
        isActive = active;
        return this;
    }

    public Integer getStatus() {
        return status;
    }

    public ActivityStatus setStatus(Integer status) {
        this.status = status;
        return this;
    }
}
