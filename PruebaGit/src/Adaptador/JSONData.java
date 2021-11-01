package Adaptador;

public class JSONData
{
    private String title;
    private int x;
    private int y;

    public JSONData(String title, int x, int y)
    {
        this.title = title;
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

    public int getX()
    {
        return x;
    }

    public void setX(int x)
    {
        this.x = x;
    }

    public int getY()
    {
        return y;
    }

    public void setY(int y)
    {
        this.y = y;
    }
}
