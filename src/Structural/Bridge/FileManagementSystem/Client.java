package Structural.Bridge.FileManagementSystem;

public class Client {

    public static void main(String[] args) {

        FileSystem windowFileSystem = new WindowsFileSystem();
        FileManager windowFileManager = new AdvancedFileManager(windowFileSystem);

        windowFileManager.readFile("C:\\example.txt");
        windowFileManager.writeFile("C:\\example.txt", "i am a cat");
       ( (AdvancedFileManager)windowFileManager).encryptAndWriteFile("C:\\example.txt", "builder");
    }
}
