package Composicion;

public class TestTransport {
    public static void main(String[] args) {
        Transport electricCar = new ElectricCar();
        Transport autopilotCombustionEngineTruck = new AutopilotCombustionEngineTruck();

        electricCar.deliver("Merida", "Libros");
        autopilotCombustionEngineTruck.deliver("Merida", "Libros");
    }
}
