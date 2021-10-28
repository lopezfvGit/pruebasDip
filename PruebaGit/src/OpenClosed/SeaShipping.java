package OpenClosed;

public class SeaShipping implements Shipping
{
    @Override
    public double getCost(Order2 order)
    {
        return Double.max(15, order.getTotalWeight() * 2.1);
    }
}
