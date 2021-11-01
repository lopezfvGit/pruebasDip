package Builder;

public class BasicCarBuilder implements Builder
{
    private BasicCar basicCar;

    public BasicCarBuilder() {
        this.reset();
    }

    @Override
    public void reset()
    {
        basicCar = new BasicCar();
    }

    @Override
    public void setSeats(int numberOfSits)
    {
        basicCar.setSeats(numberOfSits);
    }

    @Override
    public void setDoors(int numberOfDoors)
    {
        basicCar.setDoors(numberOfDoors);
    }

    @Override
    public void setEngine(String engineType)
    {
        basicCar.setEngine(engineType);
    }

    @Override
    public void setTripComputer(String computerType)
    {

    }

    @Override
    public void setGPS(String gpsType)
    {

    }

    public BasicCar getProduct() {
        BasicCar product = this.basicCar;
        this.reset();
        return product;
    }
}
