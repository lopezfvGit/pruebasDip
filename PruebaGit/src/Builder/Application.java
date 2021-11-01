package Builder;

public class Application
{
    public static void main(String[] args) {
        Director director = new Director();

        BasicCarBuilder builder = new BasicCarBuilder();
        director.constructBasicCar(builder);
        BasicCar basicCar = builder.getProduct();
        System.out.println(basicCar);

        SportsCarBuilder builder2 = new SportsCarBuilder();
        director.constructSportsCar(builder2);
        SportsCar sportsCar = builder2.getProduct();
        System.out.println(sportsCar);
    }
}
