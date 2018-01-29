package org.springtutorial.services;

import org.springtutorial.dao.CoolDao;

public class CoolServiceImpl implements CoolService {

    private CoolDao dao;

    @Override
    public void process() {
        dao.doQuery();
        System.out.println("cool service!");
    }

    public void setDao(CoolDao dao) {
        this.dao = dao;
    }
}
