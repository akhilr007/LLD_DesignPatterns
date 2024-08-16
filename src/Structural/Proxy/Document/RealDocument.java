package Structural.Proxy.Document;

public class RealDocument implements Document{

    private String content;

    public RealDocument(String content) {
        this.content = content;
    }

    @Override
    public void displayContent() {
        System.out.println("Document content: " + content);
    }
}
