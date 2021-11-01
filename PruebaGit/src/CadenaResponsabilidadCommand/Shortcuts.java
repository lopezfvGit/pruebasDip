package CadenaResponsabilidadCommand;

import java.util.HashMap;
import java.util.Map;

public class Shortcuts
{
    Map<String, Command> shortCutsMap;

    public Shortcuts()
    {
        shortCutsMap =  new HashMap<>();
    }

    public void onKeyPress(String key, Command command) {
        shortCutsMap.put(key, command);
    }

    public void keyPressed(String key) {
        Command command = shortCutsMap.get(key);

        if (command != null) {
            command.execute();
        }
    }
}
