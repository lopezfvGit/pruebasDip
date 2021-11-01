package CadenaResponsabilidadHelp;

public class Dialog extends Container
{
    private String title;
    private String wikiPageURL;

    public Dialog(String title)
    {
        this.title = title;
    }

    public void showHelp() {
        if (wikiPageURL != null) {
            System.out.println("Open wiki page with help:" + wikiPageURL);
        }
        else {
            super.showHelp();
        }
    }

    public String getTitle()
    {
        return title;
    }

    public void setTitle(String title)
    {
        this.title = title;
    }

    public String getWikiPageURL()
    {
        return wikiPageURL;
    }

    public void setWikiPageURL(String wikiPageURL)
    {
        this.wikiPageURL = wikiPageURL;
    }
}
