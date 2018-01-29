package org.springtutorial.dao;

public class CoolDaoImpl implements CoolDao {

    @Override
    public void doQuery() {
        System.out.println("cool dao!");
    }
}
