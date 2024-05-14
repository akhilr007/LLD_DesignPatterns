package Behavioral.State.TextEditor;

public class DocumentApplication {

    public static void main(String[] args) {

        // create document
        Document document = new Document();

        // create concrete commands
        ActionListenerCommand clickOpen = new ActionOpen(document);
        ActionListenerCommand clickSave = new ActionSave(document);

        // invoker
        MenuOptions menu = new MenuOptions();

        menu.addCommand(clickOpen);
        menu.addCommand(clickSave);

        menu.executeCommands();
    }
}
