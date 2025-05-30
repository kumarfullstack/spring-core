package com.autowire.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Employee {

    //@Autowired //property based autowire
    private Address address;

    //@Autowired
    @Autowired
    @Qualifier("address2")
    public void setAddress(Address address) {
        this.address = address;
    }


/*    @Autowired
    public Employee(Address address) {
        this.address = address;
    }*/

    @Override
    public String toString() {
        return "Employee{" +
                "address=" + address +
                '}';
    }
}
