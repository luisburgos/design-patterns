package strategy.pattern;

/**
 * Created by luisburgos on 12/07/15.
 */
public class ConcreteStrategyOne implements Strategy {
    @Override
    public String doSomething() {
        return "ConcreteStrategyOne";
    }
}
