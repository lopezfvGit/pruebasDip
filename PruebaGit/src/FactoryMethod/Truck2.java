package FactoryMethod;

public class Truck2 implements Transport2
{
    @Override
    public void deliver()
    {
        System.out.println("Delivering by land in a box.");
    }
}
