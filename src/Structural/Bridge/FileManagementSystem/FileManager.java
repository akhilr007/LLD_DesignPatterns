package Structural.Bridge.FileManagementSystem;

// abstraction
public abstract class FileManager {

    protected FileSystem fileSystem;

    public FileManager(FileSystem fileSystem) {
        this.fileSystem = fileSystem;
    }

    public void readFile(String path){
        fileSystem.readFile(path);
    }

    public void writeFile(String path, String content){
        fileSystem.writeFile(path, content);
    }

    public void deleteFile(String path){
        fileSystem.deleteFile(path);
    }
}
