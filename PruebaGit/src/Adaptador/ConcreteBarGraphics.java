package Adaptador;

public class ConcreteBarGraphics implements BarGraphics
{
    @Override
    public void display(XMLData xmlData)
    {
        System.out.println("Title: " + xmlData.getTitle());
        System.out.println("Subtitle: " + xmlData.getSubtitle());
        System.out.println("x: " + xmlData.getX());
        System.out.println("y: " + xmlData.getY());
    }
}
