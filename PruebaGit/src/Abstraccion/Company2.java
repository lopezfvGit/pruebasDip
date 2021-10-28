package Abstraccion;

import java.util.ArrayList;

public abstract class Company2  // Usar abstract cuando pertenecen a la misma Jerarquía
{
    private String name;
    private ArrayList<Employee> employees; //Se crea un ArrayList para guardar objetos tipo Employee.
                                          //ArrayList es una clase que permite almacenar datos en memoria de forma similar a los Arrays, con la ventaja de que el numero de elementos que almacena, lo hace de forma dinámica, es decir, que no es necesario declarar su tamaño como pasa con los Arrays

    public Company2(String name)
    {
        this.name = name;
    }

    public abstract ArrayList<Employee> getEmployees();        // Uso de abstract para obtener Employees 
    public void setEmployees(ArrayList<Employee> employees) { 
        this.employees = employees;
    }

    public String createSoftware(String systemName) {
        StringBuilder system = new StringBuilder();  //StringBuilder son clases que permiten crear objetos que almacenan cadenas de caracteres que pueden ser modificadas sin necesidad de crear nuevos objetos. Los métodos append, replace e insert que posee StringBuilder, permiten manipular las cadenas de caracteres.
   
        employees = getEmployees();                  // Obtiene Employees

        for (Employee employee: employees) {
            system.append(employee.doWork(systemName));
        }

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
