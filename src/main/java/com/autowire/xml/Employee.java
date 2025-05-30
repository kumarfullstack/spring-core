package com.autowire.xml;

public class Employee {

    private Address address;

    public void setAddress(Address address) {
        this.address = address;
    }

    // autowire="constructor"
    /*public Employee(Address address) {
        this.address = address;
    }*/

    @Override
    public String toString() {
        return "Employee{" +
                "address=" + address +
                '}';
    }
}
