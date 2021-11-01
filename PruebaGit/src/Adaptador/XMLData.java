package Adaptador;

public class XMLData
{
    private String title;
    private String subtitle;
    private double x;
    private double y;

    public XMLData(String title, String subtitle, double x, double y)
    {
        this.title = title;
        this.subtitle = subtitle;
        this.x = x;
        this.y = y;
    }

    public String getTitle()
    {
        return title;
    }

    public void setTitle(String title)
    {
        this.title = title;
    }

    public String getSubtitle()
    {
        return subtitle;
    }

    public void setSubtitle(String subtitle)
    {
        this.subtitle = subtitle;
    }

    public double getX()
    {
        return x;
    }

    public void setX(double x)
    {
        this.x = x;
    }

    public double getY()
    {
        return y;
    }

    public void setY(double y)
    {
        this.y = y;
    }
}
