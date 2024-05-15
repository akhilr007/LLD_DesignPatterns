package Behavioral.Command.TextEditor;


// concrete command
public class ActionOpen implements ActionListenerCommand{

    // receiver object
    Document document;

    public ActionOpen(Document document){
        this.document = document;
    }

    @Override
    public void execute() {
        this.document.open();
    }
}
