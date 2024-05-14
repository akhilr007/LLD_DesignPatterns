package Behavioral.State.TextEditor;

import java.util.ArrayList;
import java.util.List;

public class MenuOptions {

    private List<ActionListenerCommand> commands = new ArrayList<>();

    public void addCommand(ActionListenerCommand command){
        commands.add(command);
    }

    public void executeCommands(){
        for(ActionListenerCommand command: this.commands){
            command.execute();
        }
    }
}
