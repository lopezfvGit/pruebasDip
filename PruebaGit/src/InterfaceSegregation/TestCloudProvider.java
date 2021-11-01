package InterfaceSegregation;

// No forzar a los clientes a depender de métodos que no usan
// Interfaces pequeñas.
// Las interfaces enormes pueden romper la funcionalidad de un cliente ante un cambio incluso si ese cambio ocurre en métodos que no usa.
// Proveedores de Nube
public class TestCloudProvider
{
    public static void main(String[] args) {
        CloudProvider amazon = new Amazon();
        CloudProvider dropbox = new Dropbox();

        System.out.println("Working with amazon");
        Region region = new Region("US-west-virginia");
        amazon.createServer(region, "Tezcatlipoca");
        amazon.createServer(region, "Huitzilopochtli");
        amazon.listServers(region);
        amazon.storeFile("ventas");
        System.out.println(amazon.getFile("ventas"));
        System.out.println(amazon.getCDNAddress());

        System.out.println("Working with dropbox");
        dropbox.storeFile("tarea");
        System.out.println(dropbox.getFile("tarea"));
    }
}
