package Abstraccion;

public class BusinessAnalyst implements Employee
{
    public String doWork(String systemName) {
        return "Here's the BA for business analysis for System: " + systemName + "\n";
    }
}
