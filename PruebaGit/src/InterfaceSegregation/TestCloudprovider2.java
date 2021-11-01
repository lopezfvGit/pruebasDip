package InterfaceSegregation;

public class TestCloudprovider2 {
    public static void main(String[] args) {
        Amazon2 amazon = new Amazon2();
        CloudStorageProvider2 dropbox = new Dropbox2();

        System.out.println("Working with amazon");
        Region2 region = new Region2("US-west-virginia");
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