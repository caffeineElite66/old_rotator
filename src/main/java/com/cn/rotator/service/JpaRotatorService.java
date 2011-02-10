package com.cn.rotator.service;

import com.cn.rotator.domain.dao.RotatorDao;
import com.cn.rotator.domain.dom.Rotator;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import javax.inject.Inject;
import java.net.URL;

@Service("rotatorService")
@Repository
public class JpaRotatorService {

    private RotatorDao rotatorDao;

    @Inject
    public void setRotatorDao(RotatorDao rotatorDao) {
        this.rotatorDao = rotatorDao;
    }

    @Override
    public URL getDestingationPath(long rid) {
        Rotator rotator = rotatorDao.findRotatorById(rid);
        return
    }
}
