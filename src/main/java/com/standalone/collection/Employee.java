package com.standalone.collection;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Employee {

    private List<String> mobileNumbers;

//    private Set<String> emails;
//    private Map<String, String> vehicleNumbers;


    public List<String> getMobileNumbers() {
        return mobileNumbers;
    }

    public void setMobileNumbers(List<String> mobileNumbers) {
        this.mobileNumbers = mobileNumbers;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "mobileNumbers=" + mobileNumbers +
                '}';
    }
}
