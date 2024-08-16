package Structural.Bridge.FileManagementSystem;

// refined abstraction
public class AdvancedFileManager extends FileManager{

    public AdvancedFileManager(FileSystem fileSystem){
        super(fileSystem);
    }

    public void encryptAndWriteFile(String path, String content){
        String encryptedContent = "encrypt " + content;
        fileSystem.writeFile(path, encryptedContent);
        System.out.println("file written with encryption");
    }
}
