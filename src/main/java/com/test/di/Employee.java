package com.test.di;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Employee {
    private int id;
    private List<String> phoneNum;
    private Set<String> address;
    private Map<String, String> departments;
    private Address addr;

    public Address getAddr() {
        return addr;
    }

    public void setAddr(Address addr) {
        this.addr = addr;
    }

    public Employee(int id) {
        this.id = id;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<String> getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(List<String> phoneNum) {
        this.phoneNum = phoneNum;
    }

    public Set<String> getAddress() {
        return address;
    }

    public void setAddress(Set<String> address) {
        this.address = address;
    }

    public Map<String, String> getDepartments() {
        return departments;
    }

    public void setDepartments(Map<String, String> departments) {
        this.departments = departments;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", phoneNum=" + phoneNum +
                ", address=" + address +
                ", departments=" + departments +
                ", addr=" + addr +
                '}';
    }
}
