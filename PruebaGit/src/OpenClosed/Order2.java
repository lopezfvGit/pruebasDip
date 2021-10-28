package OpenClosed;

import java.util.ArrayList;

import Encapsulamiento.TaxCalculator;

public class Order2  //Clases abiertas a la extensión , pero cerradas  a la modificación

{
    private ArrayList<Item> items = new ArrayList<>();
    private String country;
    //private String shipping;
    //private String shipping; // Se quita como atributo para dejarlo como Objeto
    private Shipping shipping;
    private TaxCalculator taxCalculator;  // se define para recibir el impuesto de la nueva Clase TaxCalculator
    
    // public Order2(String country, String shipping) {
    public Order2(String country, Shipping shipping) {  // Se cambia el valor de Order2 a: atributo, Objeto
        this.country = country;
        this.shipping = shipping;
        this.taxCalculator = new TaxCalculator();  // Se genera una nueva instancia de la nueva Clase TaxCalculator
    }

    public double getTotal() {
        double total = 0;

        for (Item item: items) {
            total += item.getPrice() * item.getQuantity();
        }

        //total += total * getTaxRate(); // Se elimina el método getTaxRate y se genera una nueva Clase TaxCalculator exclusiva para regresar el impuestos por País

        total += total * taxCalculator.getTaxRate(country);  
        
        return total;
    
    }

    public double getTotalWeight() {
        double weight = 0;

        for (Item item: items) {
            weight += item.getWeight();
        }

        return weight;
    }

    // public double getShippingCost() {   // se quita éste método y se genera una nueva Interfaz para incorporar como nuevas clases para obtener el Costo: Por Tierra, Por Aire . Por Mar
    public double getShippingCost() {
        return shipping.getCost(this);
    }
    
    //public double getTaxRate() { // Se quita ést emétodo y se genera una nueva Clase TaxCalculator para regresar el impuestos por País
 

    public void addItem(Item item) {
        items.add(item);
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    //public String getShipping()  // Se quita como atributo y se pone como Objeto
    public Shipping getShipping()
    {
        return shipping;
    }

    //public void setShipping(String shipping) // Se quita como atributo y se pone como Objeto
    public void setShipping(Shipping shipping)
    {
        this.shipping = shipping;
    }
}
