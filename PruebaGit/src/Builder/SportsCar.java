package Builder;

public class SportsCar
{
    private int seats;
    private int doors;
    private String engine;
    private String tripComputer;
    private String gps;

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

    public String getTripComputer()
    {
        return tripComputer;
    }

    public void setTripComputer(String tripComputer)
    {
        this.tripComputer = tripComputer;
    }

    public String getGps()
    {
        return gps;
    }

    public void setGps(String gps)
    {
        this.gps = gps;
    }

    @Override
    public String toString()
    {
        return "I'm showing off my brand new SportsCar{" +
               "seats=" + seats +
               ", doors=" + doors +
               ", engine='" + engine + '\'' +
               ", tripComputer='" + tripComputer + '\'' +
               ", gps='" + gps + '\'' +
               '}';
    }
}
