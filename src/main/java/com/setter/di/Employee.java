package com.setter.di;

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

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddr(Address addr) {
        this.addr = addr;
    }

    public Map<String, String> getVehicleNumbers() {
        return vehicleNumbers;
    }

    public void setVehicleNumbers(Map<String, String> vehicleNumbers) {
        this.vehicleNumbers = vehicleNumbers;
    }

    public Set<String> getEmails() {
        return emails;
    }

    public void setEmails(Set<String> emails) {
        this.emails = emails;
    }

    public List<String> getMobileNumbers() {
        return mobileNumbers;
    }

    public void setMobileNumbers(List<String> mobileNumbers) {
        this.mobileNumbers = mobileNumbers;
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
