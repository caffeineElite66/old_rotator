package com.cn.rotator.domain;

import java.util.Collection;

/**
 * User: kevin
 * Date: 1/16/11
 * Time: 10:20 PM
 */
public interface TesterDao {

    public Tester findTesterById(long id);
    public void save(Tester tester);

}
