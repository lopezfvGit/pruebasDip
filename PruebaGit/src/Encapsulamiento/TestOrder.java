package Encapsulamiento;

public class TestOrder {
    public static void main(String[] args) {
        Item funkoPopMarx = new Item(1, 569.90, 2);
        Item funkoPopHegel = new Item(2, 450.50, 3);

        Order order = new Order("MX");
        order.addItem(funkoPopMarx);
        order.addItem(funkoPopHegel);

        System.out.println("Total a pagar en MX: " + order.getTotal());

        order.setCountry("US");
        System.out.println("Total a pagar en US: " + order.getTotal());

        order.setCountry("EU");
        System.out.println("Total a pagar en EU: " + order.getTotal());
    }
}
