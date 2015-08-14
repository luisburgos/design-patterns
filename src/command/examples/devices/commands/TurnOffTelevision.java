package command.examples.devices.commands;

import command.examples.devices.devices.ElectronicDevice;

/**
 * Created by luisburgos on 13/08/15.
 */
public class TurnOffTelevision implements Command {

    private ElectronicDevice device;

    public TurnOffTelevision(ElectronicDevice device){
        this.device = device;
    }

    @Override
    public void execute() {
        device.off();
    }

    @Override
    public void undo() {
        device.on();
    }
}
