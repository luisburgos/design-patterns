package strategy.examples.robot;

/**
 * Created by luisburgos on 12/07/15.
 */
public class RobotTestDrive {

    public static void main(String[] args) {

        Robot roboto = new Robot();
        roboto.setName("Mr. Roboto");
        roboto.setBehavior(new AgressiveBehavior());

        roboto.move();
    }

}
