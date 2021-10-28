package Abstraccion;

public class Artist implements Employee
{
    public String doWork(String systemName) {
        return "Here's the Artist for art work for System: " + systemName + "\n";
    }
}
