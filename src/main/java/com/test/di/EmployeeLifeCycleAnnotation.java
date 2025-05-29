package com.test.di;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class EmployeeLifeCycleAnnotation {

    private String name;
    private String id;

    @PostConstruct
    public void init() {
        System.out.println("Life cycle init() method invoked");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("Life cycle destroy() method invoked");
    }

    public EmployeeLifeCycleAnnotation(String name, String id) {
        this.name = name;
        this.id = id;
    }



    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                '}';
    }
}
