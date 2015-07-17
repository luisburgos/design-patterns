package abstractfactory.pattern;

/**
 * Created by luisburgos on 16/07/15.
 */
public class ConcreteFactoryOne extends AbstractFactory {
    @Override
    public AbstractProductA createProductA() {
        return new ProductAOne();
    }

    @Override
    public AbstractProductB createProductB() {
        return new ProductBOne();
    }
}
