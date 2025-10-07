package org.ulpgc.is1.model;

import java.util.Date;

public class Reservation {
    private static int NEXT_ID = 0;

    private final int id;
    private final Customer customer;
    private final Court court;
    private final Date date;
    private final int hours;

    public Reservation(Customer customer, Court court, Date date, int hours) {
        this.id = NEXT_ID++;
        this.customer = customer;
        this.court = court;
        this.date = date;
        this.hours = hours;
    }

    public int getId() {
        return id;
    }

    public Customer getCustomer() {
        return customer;
    }

    public Court getCourt() {
        return court;
    }

    public Date getDate() {
        return date;
    }

    public int getHours() {
        return hours;
    }

    public int price() {
        return hours * court.getPrice();
    }

    @Override
    public String toString() {
        return "Reservation #" + id + " - " +
                customer.getFullName() + " reserved " + court.getName() +
                " for " + hours + " hours on " + date;
    }
}
