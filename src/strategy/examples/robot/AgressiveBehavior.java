package strategy.examples.robot;

/**
 * Created by luisburgos on 12/07/15.
 */
public class AgressiveBehavior implements RobotBehavior {
    @Override
    public int moveCommand() {
        return 1;
    }

    @Override
    public String toString() {
        return "Agressive Behaviour: if find another robot attack it";
    }
}
