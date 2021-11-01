package FactoryMethod;

public class Ship2 implements Transport2
{
    @Override
    public void deliver()
    {
        System.out.println("Delivering by sea in a container.");
    }
}