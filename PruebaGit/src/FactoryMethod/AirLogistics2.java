package FactoryMethod;

public class AirLogistics2 extends Logistics2
{
    @Override
    public Transport2 createTransport()
    {
        return new Airplane2();
    }
}
