package Encapsulamiento;

import java.util.ArrayList;

public class Order {
    private ArrayList<Item> items = new ArrayList<>();
    private String country;

    public Order(String country) {
        this.country = country;
    }

    public double getTotal() {
        double total = 0;

        for (Item item: items) {
            total += item.getPrice() * item.getQuantity();
        }

        if (country == "MX") {
            total += total * 0.16;
        }
        else if (country == "US") {
            total += total * 0.07;
        }
        else if (country == "EU") {
            total += total * 0.21;
        }
        else if (country == "JP") {
            total += total * 0.10;
        }

        return total;
    }

    public void addItem(Item item) {
        items.add(item);
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
