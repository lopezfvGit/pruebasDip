package Builder;

public class Director
{
    public void constructBasicCar(Builder builder) {
        builder.reset();
        builder.setSeats(4);
        builder.setDoors(2);
        builder.setEngine("4 cylinders");
    }

   public void constructSportsCar(Builder builder) {
       builder.reset();
       builder.setSeats(2);
       builder.setDoors(2);
       builder.setEngine("8 cylinders");
       builder.setTripComputer("Advanced trip computer");
       builder.setGPS("High precision GPS");
   }
}
