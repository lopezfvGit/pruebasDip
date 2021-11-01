package CadenaResponsabilidadHelp;

public class Button extends Component
{
    private int x;
    private int y;
    private int width;
    private int height;
    private String value;

    public Button(int x, int y, int width, int height, String value)
    {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.value = value;
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

    public int getWidth()
    {
        return width;
    }

    public void setWidth(int width)
    {
        this.width = width;
    }

    public int getHeight()
    {
        return height;
    }

    public void setHeight(int height)
    {
        this.height = height;
    }

    public String getValue()
    {
        return value;
    }

    public void setValue(String value)
    {
        this.value = value;
    }
}
