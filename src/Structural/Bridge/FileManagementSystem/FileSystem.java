package Structural.Bridge.FileManagementSystem;

// implementor
public interface FileSystem {

    void readFile(String path);
    void writeFile(String path, String content);
    void deleteFile(String path);
}
