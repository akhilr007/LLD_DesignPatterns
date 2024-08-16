package Structural.Proxy.Document;

public class Client {
    public static void main(String[] args) {

        Document document = new DocumentProxy("Confidential Document", "USER");
        document.displayContent();

        Document adminDocument = new DocumentProxy("Confidential Document", "ADMIN");
        adminDocument.displayContent();
    }
}
