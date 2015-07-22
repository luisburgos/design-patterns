package builder.examples.robots;

/**
 * Created by luisburgos on 22/07/15.
 */
public class OldRobotBuilder implements RobotBuilder {

    private Robot robot;

    public OldRobotBuilder () {
        this.robot = new Robot();
    }

    @Override
    public void buildRobotHead() {
        robot.setRobotHead("Old Head");
    }

    @Override
    public void buildRobotTorso() {
        robot.setRobotTorso("Old Torso");
    }

    @Override
    public void buildRobotArms() {
        robot.setRobotArms("Old Arms");
    }

    @Override
    public void buildRobotLegs() {
        robot.setRobotLegs("Old Legs");
    }

    @Override
    public Robot getRobot() {
        return robot;
    }
}
