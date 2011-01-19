package com.cn.rotator.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

/**
 * User: kevin
 * Date: 1/16/11
 * Time: 10:19 PM
 */
@Entity
public class Tester {
    private static final long serialVersionUID = -8712872385957386182L;

    private long id;
    private Date createdAt;

    public Tester(Date date) {
        this.setCreatedAt(date);
    }

    @Column(name = "createdAt")
    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    @Id
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
