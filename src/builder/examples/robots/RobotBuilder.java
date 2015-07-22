package builder.examples.robots;

/**
 * Created by luisburgos on 22/07/15.
 */
public interface RobotBuilder {

    public void buildRobotHead();
    public void buildRobotTorso();
    public void buildRobotArms();
    public void buildRobotLegs();
    public Robot getRobot();

}
