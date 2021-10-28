package OpenClosed;

public class AirShipping implements Shipping
{
    @Override
    public double getCost(Order2 order)
    {
        return Double.max(20, order.getTotalWeight() * 3);
    }
}
