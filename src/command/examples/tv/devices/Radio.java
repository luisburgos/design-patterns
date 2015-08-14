package command.examples.tv.devices;

/**
 * Created by luisburgos on 13/08/15.
 */
public class Radio  implements ElectronicDevice {

    private int volume = 0;
    private String name;

    public Radio(String name) {
        this.name = name;
    }

    @Override
    public void on() {
        System.out.println(name + "RADIO is on");
    }

    @Override
    public void off() {
        System.out.println(name + "RADIO is off");
    }

    @Override
    public void volumeUp() {
        volume++;
        System.out.println(name + "RADIO Volume at: " + volume);
    }

    @Override
    public void volumenDown() {
        volume--;
        System.out.println(name + "RADIO Volume at: " + volume);
    }
}
