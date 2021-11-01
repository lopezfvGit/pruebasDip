package CadenaResponsabilidadCommand;

public class CopyCommand extends Command
{
    public CopyCommand(Application application, Editor editor)
    {
        super(application, editor);
    }

    @Override
    public void execute()
    {
        application.setClipboard(editor.getSelection());
    }
}
