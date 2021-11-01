package FactoryMethod;

public class Application
{
    public static void main(String[] args) {
        // preguntar

        Logistics logistics = new RoadLogistics();
        logistics.planDelivery();
    }
}
