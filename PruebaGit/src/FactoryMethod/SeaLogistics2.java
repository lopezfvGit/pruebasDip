package FactoryMethod;

public class SeaLogistics2 extends Logistics2
{
    @Override
    public Transport2 createTransport()
    {
        return new Ship2();
    }
}
