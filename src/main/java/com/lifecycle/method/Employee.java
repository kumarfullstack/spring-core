package com.lifecycle.method;

public class Employee {

    private String name ;
    private String id ;

    public void init() {
        // resource initial
        System.out.println("Life cycle init/start() method invoked");
    }

    public void destroy() {
        //clean up
        System.out.println("Life cycle destroy/end() method invoked");
    }

    public Employee(String name, String id) {
        System.out.println("constructor invoked");
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
