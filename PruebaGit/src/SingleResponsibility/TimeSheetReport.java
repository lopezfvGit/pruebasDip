package SingleResponsibility;

public class TimeSheetReport
{
    public void print(Employee2 employee) {  //  Se declara el método , ahora esperando el Objeto employee
        System.out.println("Time sheet of " + employee.getName());
        System.out.println("Hours worked: ...");
        System.out.println("Holidays: ...");
        System.out.println("Days off: ...");
    }
}
   
