package Behavioral.Command.TextEditor;

// concrete command
public class ActionSave implements ActionListenerCommand{

    // receiver
    Document document;

    public ActionSave(Document document){
        this.document = document;
    }

    @Override
    public void execute() {
        this.document.save();
    }
}
