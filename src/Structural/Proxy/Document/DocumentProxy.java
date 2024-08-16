package Structural.Proxy.Document;

public class DocumentProxy implements Document{

    private RealDocument realDocument;
    private String role;

    public DocumentProxy(String content, String role) {
        this.role = role;
        this.realDocument = new RealDocument(content);
    }

    @Override
    public void displayContent() {
        if(role.equals("ADMIN")){
            realDocument.displayContent();
        }
        else{
            System.out.println("Access Denied.. You don't have permission to view this document.");
        }
    }
}
