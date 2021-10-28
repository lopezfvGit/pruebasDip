package Abstraccion;

import java.util.ArrayList;

public class BusinessSwDevCompany extends Company2
{
    public BusinessSwDevCompany(String name)
    {
        super(name);
    }

    public ArrayList<Employee> getEmployees()
    {
        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(new BusinessAnalyst());
        employees.add(new Designer2());
        employees.add(new Programmer2());
        employees.add(new Tester2());

        return employees;
    }
}
