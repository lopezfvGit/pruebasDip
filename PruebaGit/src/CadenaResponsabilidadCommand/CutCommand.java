package CadenaResponsabilidadCommand;

public class CutCommand extends Command
{
    public CutCommand(Application application, Editor editor)
    {
        super(application, editor);
    }

    @Override
    public void execute()
    {
        saveBackup();
        application.setClipboard(editor.getSelection());
        editor.deleteSelection();
        application.saveHistory(this);
    }
}
