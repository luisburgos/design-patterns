package builder.examples.robots;

/**
 * Created by luisburgos on 22/07/15.
 */
public class RobotDirector {

    private RobotBuilder robotBuilder;

    public RobotDirector(RobotBuilder robotBuilder){
        this.robotBuilder = robotBuilder;
    }

    public Robot getRobot(){
        return this.robotBuilder.getRobot();
    }

    public void makeRobot() {
        this.robotBuilder.buildRobotHead();
        this.robotBuilder.buildRobotTorso();
        this.robotBuilder.buildRobotArms();
        this.robotBuilder.buildRobotLegs();
    }

}
