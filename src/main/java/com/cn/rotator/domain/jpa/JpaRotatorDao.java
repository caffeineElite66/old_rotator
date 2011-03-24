package com.cn.rotator.domain.jpa;

import com.cn.rotator.domain.dom.Rotator;
import com.cn.rotator.domain.dao.RotatorDao;
import java.util.List;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * User: kevin
 * Date: 1/30/11
 * Time: 5:57 PM
 */
@Repository
public class JpaRotatorDao implements RotatorDao {

    EntityManager entityManager;

    @PersistenceContext
    public void setEntityManager(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    public EntityManager getEntityManager() {
        return this.entityManager;
    }

    @Override
    public List<Rotator> getRotators() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void save(Rotator rotator) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    @Transactional
    public Rotator findRotatorById(long id) {
        return (Rotator) this.entityManager
                .createQuery("select r from Rotator r where r.id = :id")
                .setParameter("id", id).getSingleResult();
    }
}
