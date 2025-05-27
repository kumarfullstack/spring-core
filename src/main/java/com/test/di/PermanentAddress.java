package com.test.di;

public class PermanentAddress {
    private String city;
    private int postCode;

    public PermanentAddress(String city, int postCode) {
        this.city = city;
        this.postCode = postCode;
    }

    @Override
    public String toString() {
        return "PermanentAddress{" +
                "city='" + city + '\'' +
                ", postCode=" + postCode +
                '}';
    }
}
