package Composicion;

public class TestTransport2
{
    public static void main(String[] args) { 
        Engine engine = new ElectricEngine();     // Engine Clase Abstracta. ElectricEngine hereda 
        Engine fusionEngine = new FusionEngine(); // Engine Clase Abstracta. FusionEngine hereda
        Engine combustionEngine = new CombustionEngine(); // Engine Clase Abstracta. CombustionEngine hereda
        Driver driver = new Robot();              // Interface Driver
        Driver human = new Human();              // Interface Driver
        
        Transport2 transport = new Transport2(engine, driver);  // Transport2 Clase Pública
        transport.deliver("Merida", "Libros");

        Transport2 transportA = new Transport2(fusionEngine, driver);
        transportA.deliver("Merida", "Libros");
        
        Transport2 transportB = new Transport2(combustionEngine, driver);
        transportB.deliver("Merida", "Libros");
        
        Transport2 transportC = new Transport2(engine, human);  // Transport2 Clase Pública
        transportC.deliver("Merida", "Libros");

        Transport2 transportD = new Transport2(fusionEngine, human);
        transportD.deliver("Merida", "Libros");
        
        Transport2 transportE = new Transport2(combustionEngine, human);
        transportE.deliver("Merida", "Libros");
    }
}