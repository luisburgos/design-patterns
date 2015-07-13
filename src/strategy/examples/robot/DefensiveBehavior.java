package strategy.examples.robot;

/**
 * Created by luisburgos on 12/07/15.
 */
public class DefensiveBehavior implements RobotBehavior {
    @Override
    public int moveCommand() {
        return -1;
    }

    @Override
    public String toString() {
        return "Defensive Behaviour: if find another robot run from it";
    }
}
