package org.ulpgc.is1.model;

public class Address {
    private String street;
    private int number;
    private int postalCode;
    private String city;

    public Address(String street, int number, int postalCode, String city) {
        this.street = street;
        this.number = number;
        this.postalCode = postalCode;
        this.city = city;
    }

    @Override
    public String toString() {
        return street + " " + number + ", " + postalCode + ", " + city;
    }
}
