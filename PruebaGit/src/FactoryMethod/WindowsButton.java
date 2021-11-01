package FactoryMethod;

public class WindowsButton implements Button
{
    @Override
    public void render()
    {
        System.out.println("Painting a windows style button.");
    }

    @Override
    public void onClick(String function)
    {
        System.out.println("Executing function " + function + " on windows");
    }
}
