package com.cn.rotator.service;

import com.cn.rotator.domain.JpaTesterDao;
import com.cn.rotator.domain.Tester;

/**
 * User: kevin
 * Date: 1/16/11
 * Time: 10:28 PM
 */
public class TesterService {

    private JpaTesterDao testerDao;

    public void save(Tester tester) {
        this.testerDao.save(tester);
    }

    public JpaTesterDao getTesterDao() {
        return testerDao;
    }

    public void setTesterDao(JpaTesterDao testerDao) {
        this.testerDao = testerDao;
    }
}
