package Abstraccion;

public class Company
{
    private String name;

    public Company(String name)
    {
        this.name = name;
    }

    public String createSoftware(String systemName) {
        StringBuilder system = new StringBuilder();

        Designer designer = new Designer();
        system.append(designer.designArchitecture(systemName));

        Programmer programmer = new Programmer();
        system.append(programmer.writeCode(systemName));

        Tester tester = new Tester();
        system.append(tester.testSoftware(systemName));

        return system.toString();
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }
}
