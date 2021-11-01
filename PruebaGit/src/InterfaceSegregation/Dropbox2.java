package InterfaceSegregation;

public class Dropbox2 implements CloudStorageProvider2 {
    @Override
    public void storeFile(String name)
    {
        System.out.println("Dropbox2 is storing file " + name);
    }

    @Override
    public String getFile(String name)
    {
        return "Dropbox2 file " + name;
    }
}