package FactoryMethod;

public abstract class Logistics2
{
    public void planDelivery() {
        Transport2 transport = createTransport();
        System.out.println("Setting the plan."); ////
        transport.deliver();
    }

    public abstract Transport2 createTransport();
}
