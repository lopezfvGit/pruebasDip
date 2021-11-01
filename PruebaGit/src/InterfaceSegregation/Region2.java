package InterfaceSegregation;

import java.util.ArrayList;
public class Region2 {
    private String name;
    private ArrayList<String> servers;

    public Region2(String name)
    {
        this.name = name;
        servers = new ArrayList<>();
    }

    public void addServer(String server) {
        servers.add(server);
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public ArrayList<String> getServers()
    {
        return servers;
    }

    public void setServers(ArrayList<String> servers)
    {
        this.servers = servers;
    }
}
