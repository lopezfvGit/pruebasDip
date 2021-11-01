package CadenaResponsabilidadHelp;

public class Application
{
    private Dialog dialog;
    private Panel panel;
    private Button ok;
    private Button cancel;

    public void createUI() {
        dialog = new Dialog("Budget reports");
        dialog.setWikiPageURL("https://wiki.help/dialog");

        panel = new Panel(0, 0, 400, 800);
        panel.setModalHelpText("This is a panel");

        ok = new Button(250, 760, 50, 20, "OK");
        ok.setTooltipText("This button sends the request");

        cancel = new Button(320, 760, 50, 20, "Cancel");

        panel.add(ok);
        panel.add(cancel);
        dialog.add(panel);
    }

    public void onF1KeyPress() {
        //Simulating mouse was on this element
        Component component = dialog;
        component.showHelp();
    }

    public static void main(String[] args) {
        Application application = new Application();
        application.createUI();
        application.onF1KeyPress();
    }
}
