package OpenClosed;

public class TestOrder2
{
    public static void main(String[] args) {
        Item funkoPopMarx = new Item(1, 569.90, 150, 2);
        Item funkoPopHegel = new Item(2, 450.50, 150, 3);
        Item pin = new Item(3, 55.90, 0.5, 1);

        Shipping groundShipping = new GroundShipping();
        Shipping airShipping = new AirShipping();
        Shipping seaShipping = new SeaShipping();
        Order2 order = new Order2("MX", groundShipping);
        order.addItem(pin);
        System.out.println("Costo de envio en MX compra pequena por tierra: " + order.getShippingCost());

        order.setShipping(airShipping);
        System.out.println("Costo de envio en MX compra pequena por aire: " + order.getShippingCost());

        order.addItem(funkoPopMarx);
        order.addItem(funkoPopHegel);
        System.out.println("Costo de envio en MX compra grande por aire: " + order.getShippingCost());

        order.setShipping(groundShipping);
        System.out.println("Costo de envio en MX compra grande por tierra: " + order.getShippingCost());

        order.setShipping(seaShipping);
        System.out.println("Costo de envio en MX compra grande por mar: " + order.getShippingCost());
    }
}
