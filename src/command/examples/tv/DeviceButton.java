package command.examples.tv;

import command.examples.tv.commands.Command;

/**
 * The INVOKER
 * Created by luisburgos on 13/08/15.
 */
public class DeviceButton {

    private Command command;

    public DeviceButton(Command command){
        this.command = command;
    }

    public void press(){
        command.execute();
    }

    public void pressUndo(){
        command.undo();
    }
}
