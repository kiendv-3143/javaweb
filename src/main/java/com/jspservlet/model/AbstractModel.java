package com.jspservlet.model;

import java.sql.Timestamp;

public class AbstractModel<T> {
    private Long id;
    private Timestamp createdAt;
    private Timestamp updateAt;
    private Timestamp deletedAt;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Timestamp getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Timestamp created_at) {
        this.createdAt = created_at;
    }

    public Timestamp getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt(Timestamp update_at) {
        this.updateAt = update_at;
    }

    public Timestamp getDeletedAt() {
        return deletedAt;
    }

    public void setDeletedAt(Timestamp deleted_at) {
        this.deletedAt = deleted_at;
    }
}
