package FactoryMethod;

public class HTMLButton implements Button
{
    @Override
    public void render()
    {
        System.out.println("Painting an HTML style button.");
    }

    @Override
    public void onClick(String function)
    {
        System.out.println("Executing function " + function + " on browser");
    }
}
