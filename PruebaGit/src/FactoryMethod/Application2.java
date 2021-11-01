package FactoryMethod;

import java.util.Scanner;

public class Application2
{
    private Logistics2 logistics;

    public void initialize(String logisticsType) throws Exception {
        if (logisticsType.equals("road")) {
            logistics = new RoadLogistics2();
        }
        else if (logisticsType.equals("sea")) {
            logistics = new SeaLogistics2();
        }
        else if (logisticsType.equals("air")) {
            logistics = new AirLogistics2();
        }
        else {
            throw new Exception("Unsupported logistics2");
        }
    }

    public void main(String logisticsType) throws Exception {
        this.initialize(logisticsType);
        logistics.planDelivery();
        //....
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Proporciona el tipo de logistica (road/sea/air): ");
        String logisticsType = scanner.next();

        Application2 application = new Application2();

        try
        {
            application.main(logisticsType);
        }
        catch (Exception exception) {
            System.out.println(exception.getMessage());
        }
    }
}
