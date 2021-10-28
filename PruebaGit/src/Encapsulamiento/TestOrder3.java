package Encapsulamiento;

public class TestOrder3  // Encapsular a nivel de Clase
{
    public static void main(String[] args) {
        Item funkoPopMarx = new Item(1, 569.90, 2);
        Item funkoPopHegel = new Item(2, 450.50, 3);

        Order3 order = new Order3("MX");
        order.addItem(funkoPopMarx);
        order.addItem(funkoPopHegel);

        System.out.println("Total a pagar en MX: " + order.getTotal());

        order.setCountry("US");
        System.out.println("Total a pagar en US: " + order.getTotal());

        order.setCountry("EU");
        System.out.println("Total a pagar en EU: " + order.getTotal());
    }
}
