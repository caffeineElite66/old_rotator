package com.cn.rotator.domain.dom;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;


/**
 * Object mapping for hibernate-handled table: RotatorDestinationPath.
 * 
 * @author autogenerated
 */

@Entity
@Table(name = "RotatorDestinationPath", catalog = "rotator")
public class RotatorDestinationPath implements Cloneable, Serializable {

    private static final long serialVersionUID = -559008637L;

    @Id
    private long id;

    private String pathName;

    @Temporal(TemporalType.DATE)
    private Date createdAt;

    @Temporal(TemporalType.DATE)
    private Date updateAt;

    private String url;

    private float pathPercent;

    @ManyToOne
    private Rotator rotator;

    private boolean active;

    public RotatorDestinationPath() {
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getPathName() {
        return pathName;
    }

    public void setPathName(String pathName) {
        this.pathName = pathName;
    }

    public float getPathPercent() {
        return pathPercent;
    }

    public void setPathPercent(float pathPercent) {
        this.pathPercent = pathPercent;
    }

    public Rotator getRotator() {
        return rotator;
    }

    public void setRotator(Rotator rotator) {
        this.rotator = rotator;
    }

    public Date getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt(Date updateAt) {
        this.updateAt = updateAt;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }



}
