package com.constructor.di;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Employee {
    private int id;
    private String name;
    private Address addr;//dependency

    private List<String> mobileNumbers;
    private Set<String> emails;
    private Map<String, String> vehicleNumbers;

    public Employee(int id, String name, Address addr, List<String> mobileNumbers,
                    Set<String> emails, Map<String, String> vehicleNumbers) {
        this.id = id;
        this.name = name;
        this.addr = addr;
        this.mobileNumbers = mobileNumbers;
        this.emails = emails;
        this.vehicleNumbers = vehicleNumbers;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", addr=" + addr +
                ", mobileNumbers=" + mobileNumbers +
                ", emails=" + emails +
                ", vehicleNumbers=" + vehicleNumbers +
                '}';
    }
}
