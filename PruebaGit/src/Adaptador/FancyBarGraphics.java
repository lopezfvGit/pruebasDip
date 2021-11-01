package Adaptador;

public class FancyBarGraphics
{
    public void paint(JSONData jsonData) {
        System.out.println(jsonData.getTitle());
        System.out.println(jsonData.getX());
        System.out.println(jsonData.getY());
    }
}
