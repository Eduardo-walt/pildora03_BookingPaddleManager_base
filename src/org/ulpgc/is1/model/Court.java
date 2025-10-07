package org.ulpgc.is1.model;

public class Court {
    private String name;
    private int price;
    private CourtType type;

    public Court(String name, int price, CourtType type) {
        this.name = name;
        this.price = price;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public CourtType getType() {
        return type;
    }

    @Override
    public String toString() {
        return name + " (" + type + "), Price: " + price + "€";
    }
}
