package InterfaceSegregation;

public interface CloudStorageProvider2 {
    void storeFile(String name);
    String getFile(String name);
}