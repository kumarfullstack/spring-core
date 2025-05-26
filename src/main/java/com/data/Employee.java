package com.data;

public class Employee {
    private int id;
    private String name;
    private Address addr;//dependency

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddr(Address addr) {
        this.addr = addr;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", addr=" + addr +
                '}';
    }
}
