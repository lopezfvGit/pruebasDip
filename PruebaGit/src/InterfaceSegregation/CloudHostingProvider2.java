package InterfaceSegregation;

public interface CloudHostingProvider2 {
    void createServer(Region2 region, String serverName);
    void listServers(Region2 region);
}