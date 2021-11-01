package CadenaResponsabilidadCommand;

public class Editor
{
    private String text;
    private int startIndex;
    private int endIndex;

    public String getSelection() {
        return text.substring(startIndex, endIndex);
    }

    public void deleteSelection() {
        text = text.replace(text.substring(startIndex, endIndex), "");
    }

    public void replaceSelection(String newText) {
        text = text.replace(text.substring(startIndex, endIndex), newText);
    }

    public String getText()
    {
        return text;
    }

    public void setText(String text)
    {
        this.text = text;
    }

    public int getStartIndex()
    {
        return startIndex;
    }

    public void setStartIndex(int startIndex)
    {
        this.startIndex = startIndex;
    }

    public int getEndIndex()
    {
        return endIndex;
    }

    public void setEndIndex(int endIndex)
    {
        this.endIndex = endIndex;
    }
}
