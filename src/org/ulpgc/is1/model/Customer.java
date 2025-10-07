package org.ulpgc.is1.model;

import java.util.ArrayList;
import java.util.List;

public class Customer {
    private String name;
    private String surname;
    private Address address;
    private List<Reservation> reservations;

    public Customer(String name, String surname, String street, int number, int postalCode, String city) {
        this.name = name;
        this.surname = surname;
        this.address = new Address(street, number, postalCode, city);
        this.reservations = new ArrayList<>();
    }

    public void addReservation(Reservation reservation) {
        reservations.add(reservation);
    }

    public Reservation getReservation(int index) {
        return reservations.get(index);
    }

    public String getFullName() {
        return name + " " + surname;
    }

    public Address getAddress() {
        return address;
    }
}
