package InterfaceSegregation;

import java.util.ArrayList;

public class Amazon2 implements CloudStorageProvider2, CloudHostingProvider2, CDNProvider2
{
    ArrayList<Region> regions;

    public Amazon2()
    {
        this.regions = new ArrayList<>();
    }

    @Override
    public void storeFile(String name)
    {
        System.out.println("Amazon2 is storing file " + name);
    }

    @Override
    public String getFile(String name)
    {
        return "Amazon2 file " + name;
    }

    @Override
    public void createServer(Region2 region, String serverName)
    {
        region.addServer(serverName);
    }

    @Override
    public void listServers(Region2 region)
    {
        System.out.println("Amazon2 region2 " + region.getName() + " contains the following servers: ");

        for (String server: region.getServers()) {
            System.out.println(server);
        }
    }

    @Override
    public String getCDNAddress()
    {
        return "Amazon2 CDN Address";
    }
}