package com.lifecycle.method;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

import javax.annotation.PreDestroy;

public class EmployeeInterface implements InitializingBean, DisposableBean {

    private String name ;
    private String id ;

    public EmployeeInterface(String name, String id) {
        System.out.println("constructor invoked");
        this.name = name;
        this.id = id;
    }

    //init()
    @Override
    public void afterPropertiesSet() throws Exception {
        //resource creation logic
        System.out.println("afterPropertiesSet() called");
    }

    @Override
    public void destroy() throws Exception {
        //clean close the resource logic
        System.out.println("destroy() called");
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                '}';
    }



}
