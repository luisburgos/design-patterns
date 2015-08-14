package command.examples.tv;

import command.examples.tv.commands.TurnOffAllDevices;
import command.examples.tv.commands.TurnOffTelevision;
import command.examples.tv.commands.TurnOnTelevision;
import command.examples.tv.commands.VolumeUpTelevision;
import command.examples.tv.devices.ElectronicDevice;
import command.examples.tv.devices.Radio;
import command.examples.tv.devices.Television;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by luisburgos on 13/08/15.
 */
public class Client {

    public static void main(String[] args){

        ElectronicDevice televisionOne = new Television("SAMSUMG");

        TurnOnTelevision onCommand = new TurnOnTelevision(televisionOne);

        DeviceButton onPressed;
        onPressed = new DeviceButton(onCommand);
        onPressed.press();


        TurnOffTelevision offCommand = new TurnOffTelevision(televisionOne);
        onPressed = new DeviceButton(offCommand);
        onPressed.press();

        VolumeUpTelevision volUpCommand = new VolumeUpTelevision(televisionOne);
        onPressed = new DeviceButton(volUpCommand);
        onPressed.press();
        onPressed.press();
        onPressed.press();

        Television televisionTwo = new Television("SONY");
        Radio radioOne = new Radio("PIONEER");

        List<ElectronicDevice> allDevices = new ArrayList<>();

        allDevices.add(televisionTwo);
        allDevices.add(radioOne);

        TurnOffAllDevices turnOffDevices = new TurnOffAllDevices(allDevices);

        DeviceButton turnThemOff = new DeviceButton(turnOffDevices);

        turnThemOff.press();
        turnThemOff.pressUndo();

    }

}
