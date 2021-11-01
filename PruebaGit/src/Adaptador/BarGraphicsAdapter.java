package Adaptador;

public class BarGraphicsAdapter implements BarGraphics
{
    FancyBarGraphics fancyBarGraphics;

    public BarGraphicsAdapter(FancyBarGraphics fancyBarGraphics)
    {
        this.fancyBarGraphics = fancyBarGraphics;
    }

    @Override
    public void display(XMLData xmlData)
    {
        JSONData jsonData = new JSONData(xmlData.getTitle() + ". " + xmlData.getSubtitle(),
                                         (int) Math.round(xmlData.getX()), (int) Math.round(xmlData.getY()));
        fancyBarGraphics.paint(jsonData);
    }

    public FancyBarGraphics getFancyBarGraphics()
    {
        return fancyBarGraphics;
    }

    public void setFancyBarGraphics(FancyBarGraphics fancyBarGraphics)
    {
        this.fancyBarGraphics = fancyBarGraphics;
    }
}
