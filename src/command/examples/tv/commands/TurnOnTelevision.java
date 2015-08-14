package command.examples.tv.commands;

import command.examples.tv.devices.ElectronicDevice;

/**
 * Created by luisburgos on 13/08/15.
 */
public class TurnOnTelevision implements Command {

    private ElectronicDevice device;

    public TurnOnTelevision(ElectronicDevice device){
        this.device = device;
    }

    @Override
    public void execute() {
        device.on();
    }

    @Override
    public void undo() {
        device.off();
    }
}
