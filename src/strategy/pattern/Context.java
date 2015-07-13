package strategy.pattern;

/**
 * Created by luisburgos on 12/07/15.
 */
public class Context {

    private Strategy strategy;

    public Context(){}

    public void setStrategy(Strategy behavior) {
        this.strategy = behavior;
    }

    public Strategy getStrategy() {
        return strategy;
    }

    public void executeStrategy(){
        System.out.println(strategy.doSomething());
    }
}
