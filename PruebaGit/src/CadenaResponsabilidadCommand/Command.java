package CadenaResponsabilidadCommand;

public abstract class Command
{
    protected Application application;
    protected Editor editor;
    protected String backup;

    public Command(Application application, Editor editor)
    {
        this.application = application;
        this.editor = editor;
    }

    public void saveBackup() {
        backup = editor.getText();
    }

    public void undo() {
        editor.setText(backup);
    }

    public abstract void execute();
}
