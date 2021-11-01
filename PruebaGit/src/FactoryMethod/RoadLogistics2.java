package FactoryMethod;

public class RoadLogistics2 extends Logistics2
{
    @Override
    public Transport2 createTransport()
    {
        return new Truck2();
    }
}
