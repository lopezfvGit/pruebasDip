package InterfaceSegregation;

public class Dropbox implements CloudProvider
{
    @Override
    public void storeFile(String name)
    {
        System.out.println("Dropbox is storing file " + name);
    }

    @Override
    public String getFile(String name)
    {
        return "Dropbox file " + name;
    }

    @Override
    public void createServer(Region region, String serverName)
    {

    }

    @Override
    public void listServers(Region region)
    {

    }

    @Override
    public String getCDNAddress()
    {
        return null;
    }
}
