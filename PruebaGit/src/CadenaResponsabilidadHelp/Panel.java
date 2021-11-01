package CadenaResponsabilidadHelp;

public class Panel extends Container
{
    private int x;
    private int y;
    private int width;
    private int height;
    private String modalHelpText;

    public Panel(int x, int y, int width, int height)
    {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    public void showHelp() {
        if (modalHelpText != null) {
            System.out.println("Show modal with help:" + modalHelpText);
        }
        else {
            super.showHelp();
        }
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

    public String getModalHelpText()
    {
        return modalHelpText;
    }

    public void setModalHelpText(String modalHelpText)
    {
        this.modalHelpText = modalHelpText;
    }
}
