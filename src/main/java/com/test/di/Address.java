package com.test.di;

public class Address {
    private String street;
    private int zipcode;
    private PermanentAddress permanentAddress;

    public Address(PermanentAddress permanentAddress) {
        this.permanentAddress = permanentAddress;
    }

    public Address(String street, int zipcode) {
        this.street = street;
        this.zipcode = zipcode;
    }

    @Override
    public String toString() {
        return "Address{" +
                "street='" + street + '\'' +
                ", zipcode=" + zipcode +
                ", permanentAddress=" + permanentAddress +
                '}';
    }
}
