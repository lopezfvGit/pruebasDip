package LiskovSubstitution;

public class WritableDocument extends Document2
{
    public WritableDocument(String fileName)
    {
        super(fileName);
    }

    public void save() {
        System.out.println(this.getData() + " was saved in " + getFileName());
    }
}
