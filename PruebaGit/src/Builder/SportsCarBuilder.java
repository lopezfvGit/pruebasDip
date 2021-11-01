package Builder;

public class SportsCarBuilder implements Builder
{
    private SportsCar sportsCar;

    public SportsCarBuilder() {
        this.reset();
    }

    @Override
    public void reset()
    {
        sportsCar = new SportsCar();
    }

    @Override
    public void setSeats(int numberOfSits)
    {
        sportsCar.setSeats(numberOfSits);
    }

    @Override
    public void setDoors(int numberOfDoors)
    {
        sportsCar.setDoors(numberOfDoors);
    }

    @Override
    public void setEngine(String engineType)
    {
        sportsCar.setEngine(engineType);
    }

    @Override
    public void setTripComputer(String computerType)
    {
        sportsCar.setTripComputer(computerType);
    }

    @Override
    public void setGPS(String gpsType)
    {
        sportsCar.setGps(gpsType);
    }

    public SportsCar getProduct() {
        SportsCar product = this.sportsCar;
        this.reset();
        return product;
    }
}
