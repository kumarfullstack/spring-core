package com.stereotype.annotation;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

import java.util.List;

//@Component("emp")
@Component
public class Employee {

    @Value("E-100")
    private String id;

    @Value("Laxman")
    private String name;

    @Value("#{mobileNumbers}")
    private List<String> mobileNumbers;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", mobileNumbers=" + mobileNumbers +
                '}';
    }

    public void getEmpInfo() {
         System.out.println("Ename: Ram and Eid: I1222");
     }
}
