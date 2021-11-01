package Builder;

public class BasicCar
{
    private int seats;
    private int doors;
    private String engine;

    public int getSeats()
    {
        return seats;
    }

    public void setSeats(int seats)
    {
        this.seats = seats;
    }

    public int getDoors()
    {
        return doors;
    }

    public void setDoors(int doors)
    {
        this.doors = doors;
    }

    public String getEngine()
    {
        return engine;
    }

    public void setEngine(String engine)
    {
        this.engine = engine;
    }

    @Override
    public String toString()
    {
        return "I'm proud of my BasicCar{" +
               "seats=" + seats +
               ", doors=" + doors +
               ", engine='" + engine + '\'' +
               '}';
    }
}
