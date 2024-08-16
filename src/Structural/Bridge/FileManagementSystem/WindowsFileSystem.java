package Structural.Bridge.FileManagementSystem;

// concrete implementor: Windows File System
public class WindowsFileSystem implements FileSystem{

    @Override
    public void readFile(String path) {
        System.out.println("Reading file from Windows file system: " + path);
    }

    @Override
    public void writeFile(String path, String content) {
        System.out.println("Writing file from Windows file system: " + path);
    }

    @Override
    public void deleteFile(String path) {
        System.out.println("Deleting file from Windows file system: " + path);
    }
}
