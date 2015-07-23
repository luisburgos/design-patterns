package builder.pattern;

/**
 * Created by luisburgos on 22/07/15.
 */
public class ConcreteBuilder implements Builder{

    private Product product;

    public ConcreteBuilder() {
        this.product = new Product();
    }

    @Override
    public void buildPartOne() {
        product.setPartOne("Part One");
    }

    @Override
    public void buildPartTwo() {
        product.setPartTwo("Part Two");
    }

    @Override
    public void buildPartThree() {
        product.setPartThree("Part Three");
    }

    @Override
    public Product getProduct() {
        return product;
    }
}
