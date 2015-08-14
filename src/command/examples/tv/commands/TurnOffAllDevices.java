package command.examples.tv.commands;

import command.examples.tv.devices.ElectronicDevice;

import java.util.List;

/**
 * Created by luisburgos on 13/08/15.
 */
public class TurnOffAllDevices implements Command {

    List<ElectronicDevice> allDevices;

    public TurnOffAllDevices(List<ElectronicDevice> newDevices) {
        allDevices = newDevices;
    }

    public void execute() {
        for (ElectronicDevice device : allDevices) {
            device.off();
        }
    }

    public void undo() {
        for (ElectronicDevice device : allDevices) {
            device.on();
        }
    }
}