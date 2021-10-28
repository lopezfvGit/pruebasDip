package Encapsulamiento;

import java.util.ArrayList;

public class Order3 {
    private ArrayList<Item> items = new ArrayList<>();
    private String country;
    private TaxCalculator taxCalculator;  // se define para recibir el impuesto de la nueva Clase TaxCalculator

    public Order3(String country) {
        this.country = country;
        this.taxCalculator = new TaxCalculator();  // Se genera una nueva instancia de la nueva Clase TaxCalculator
    }

    public double getTotal() {
        double total = 0;

        for (Item item: items) {
            total += item.getPrice() * item.getQuantity();
        }

        total += total * taxCalculator.getTaxRate(country);  // Se divide éste método getTotal en dos partes : en la actual se queda el cálculo del Precio por la cantidad y en la segunda parte se genera una nueva Clase exclusiva para regresar el impuestos por País
                                         
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
