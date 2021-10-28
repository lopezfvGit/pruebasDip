package SingleResponsibility;

public class Employee2  // Se quita el método printTimeReport, y se pone como una nueva clase
	{
	    private String name;
	    //private String ssn;

	    public Employee2(String name)
	    {
	        this.name = name;
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
