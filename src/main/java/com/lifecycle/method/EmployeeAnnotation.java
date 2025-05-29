package com.lifecycle.method;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class EmployeeAnnotation {

    private String name ;
    private String id ;

    public EmployeeAnnotation(String name, String id) {
        System.out.println("constructor invoked");
        this.name = name;
        this.id = id;
    }

    @PostConstruct
    public void start() throws Exception {
        //resource creation logic
        System.out.println("start() called");
    }

    @PreDestroy
    public void end() throws Exception {
        //clean close the resource logic
        System.out.println("end() called");
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                '}';
    }



}
