package strategy.examples.robot;

/**
 * Created by luisburgos on 12/07/15.
 */
public class NormalBehavior implements RobotBehavior {
    @Override
    public int moveCommand() {
        return 0;
    }

    @Override
    public String toString() {
        return "Normal Behaviour: if find another robot ignore it";
    }
}
