package com.cn.rotator.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * User: kevin
 * Date: 1/16/11
 * Time: 10:19 PM
 */
@Entity
@Table(name = "Tester")
public class Tester implements Serializable {

    private long id;
    private Date createdAt;

    public Tester() {
        this.createdAt = new Date();
    }

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
    //@GeneratedValue(strategy = GenerationType.TABLE)
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
