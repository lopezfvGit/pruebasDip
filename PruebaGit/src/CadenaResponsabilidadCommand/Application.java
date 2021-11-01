package CadenaResponsabilidadCommand;

import Builder.Builder;

import java.util.ArrayList;
import java.util.function.Consumer;

public class Application
{
    private String clipboard;
    private ArrayList<Editor> editors;
    private Editor activeEditor;
    private CommandHistory history;
    private Shortcuts shortcuts;
    private Button copyButton;
    private Button cutButton;
    private Button pasteButton;
    private Button undoButton;

    public Application(String clipboard,
                       Editor activeEditor)
    {
        this.clipboard = clipboard;
        this.editors = new ArrayList<>();
        this.activeEditor = activeEditor;
        editors.add(activeEditor);
        this.history = new CommandHistory();
    }

    public void createUI() {
        shortcuts = new Shortcuts();

        Command copyCommand = new CopyCommand(this, activeEditor);
        copyButton = new Button("Copy", copyCommand);
        shortcuts.onKeyPress("Ctrl+C", copyCommand);

        Command cutCommand = new CutCommand(this, activeEditor);
        cutButton = new Button("Cut", cutCommand);
        shortcuts.onKeyPress("Ctrl+X", cutCommand);

        Command pasteCommand = new PasteCommand(this, activeEditor);
        pasteButton = new Button("Paste", pasteCommand);
        shortcuts.onKeyPress("Ctrl+V", pasteCommand);

        Command undoCommand = new UndoCommand(this, activeEditor);
        undoButton = new Button("Undo", undoCommand);
        shortcuts.onKeyPress("Ctrl+Z", undoCommand);
    }

    public void saveHistory(Command command) {
        history.push(command);
    }

    public void undo() {
        Command command = history.pop();

        if (command != null) {
            command.undo();
        }
    }

    public String getClipboard()
    {
        return clipboard;
    }

    public void setClipboard(String clipboard)
    {
        this.clipboard = clipboard;
    }

    public ArrayList<Editor> getEditors()
    {
        return editors;
    }

    public void addEditor(Editor editor)
    {
        this.editors.add(editor);
    }

    public Editor getActiveEditor()
    {
        return activeEditor;
    }

    public void setActiveEditor(Editor activeEditor)
    {
        this.activeEditor = activeEditor;
    }

    public CommandHistory getHistory()
    {
        return history;
    }

    public void setHistory(CommandHistory history)
    {
        this.history = history;
    }

    public Shortcuts getShortcuts()
    {
        return shortcuts;
    }

    public void setShortcuts(Shortcuts shortcuts)
    {
        this.shortcuts = shortcuts;
    }

    public Button getCopyButton()
    {
        return copyButton;
    }

    public void setCopyButton(Button copyButton)
    {
        this.copyButton = copyButton;
    }

    public Button getCutButton()
    {
        return cutButton;
    }

    public void setCutButton(Button cutButton)
    {
        this.cutButton = cutButton;
    }

    public Button getPasteButton()
    {
        return pasteButton;
    }

    public void setPasteButton(Button pasteButton)
    {
        this.pasteButton = pasteButton;
    }

    public Button getUndoButton()
    {
        return undoButton;
    }

    public void setUndoButton(Button undoButton)
    {
        this.undoButton = undoButton;
    }

    public static void main(String[] args) {
        Editor editor = new Editor();
        editor.setText("Hola este es mi ejemplo.");
        Application application = new Application(null, editor);
        application.createUI();
        application.getActiveEditor().setStartIndex(0);
        application.getActiveEditor().setEndIndex(4);
        System.out.println("Editor has: " + editor.getText());
        application.getCutButton().click();
        System.out.println("Editor has: " + editor.getText());
        application.getUndoButton().click();
        System.out.println("Editor has: " + editor.getText());
    }
}
