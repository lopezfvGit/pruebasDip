package CadenaResponsabilidadCommand;

public class PasteCommand extends Command
{
    public PasteCommand(Application application, Editor editor)
    {
        super(application, editor);
    }

    @Override
    public void execute()
    {
        saveBackup();
        editor.replaceSelection(application.getClipboard());
        application.saveHistory(this);
    }
}
