package counter;

import java.util.ArrayList;
import java.util.List;

public class HistoryList {
    private List<Command> commandList = new ArrayList<>();
    private List<Command> undoList = new ArrayList<>();

    public void addCommand(Command command){
        commandList.add(command);
    }

    public void undo(){
        if(!commandList.isEmpty()){
            Command commandObject = commandList.get(commandList.size() - 1);
            commandList.remove(commandObject);
            commandObject.unExcute();
            undoList.add(commandObject);
        }
    }

    public void redo(){
        if(!undoList.isEmpty()){
            Command commandObject = undoList.get(undoList.size() - 1);
            undoList.remove(commandObject);
            commandObject.excute();
            commandList.add(commandObject);
        }
    }
}
