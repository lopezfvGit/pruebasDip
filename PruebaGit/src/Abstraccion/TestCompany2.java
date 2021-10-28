package Abstraccion;

public class TestCompany2
{
    public static void main(String[] args) {
        Company2 gameDevCompany = new GameDevCompany("A tu medida");
        System.out.println(gameDevCompany.createSoftware("Pokemon"));

        Company2 businessSwDevCompany = new BusinessSwDevCompany("A tu medida");
        System.out.println(businessSwDevCompany.createSoftware("Nomina"));
    }
}