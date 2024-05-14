package Behavioral.State.TextEditor;

// receiver - performing the operation
public class Document {

    void open(){
        System.out.println("Document opened");
    }

    void save(){
        System.out.println("Document saved");
    }
}
