package CadenaResponsabilidadCommand;

import java.util.function.Consumer;

public class Button
{
    private String name;
    private Command command;

    public Button(String name, Command command)
    {
        this.name = name;
        this.command = command;
    }

    public void click() {
        command.execute();
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public Command getCommand()
    {
        return command;
    }

    public void setCommand(Command command)
    {
        this.command = command;
    }
}
