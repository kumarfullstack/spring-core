package com.test.di;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class EmployeeLifeCycleInterface implements InitializingBean, DisposableBean {

    private String name;
    private String id;

/*    public void init() {
        System.out.println("Life cycle init() method invoked");
    }*/
    public EmployeeLifeCycleInterface(String name, String id) {
        this.name = name;
        this.id = id;
    }

    public void destroy() {
        System.out.println("Life cycle destroy() method invoked");
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                '}';
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Life cycle afterPropertiesSet() method invoked");
    }
}
