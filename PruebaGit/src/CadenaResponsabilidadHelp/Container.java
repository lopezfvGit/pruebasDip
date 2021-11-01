package CadenaResponsabilidadHelp;

import java.util.ArrayList;

public abstract class Container extends Component
{
    protected ArrayList<Component> children;

    public Container()
    {
        children = new ArrayList<>();
    }

    public void add(Component child) {
        children.add(child);
        child.container = this;
    }
}
