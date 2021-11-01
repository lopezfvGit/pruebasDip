package FactoryMethod;

public class Airplane2 implements Transport2
{
    @Override
    public void deliver()
    {
        System.out.println("Delivering2 by air in an envelop.");
    }
}
