package builder.pattern;

/**
 * Created by luisburgos on 22/07/15.
 */
public interface Builder {
    public void buildPartOne();
    public void buildPartTwo();
    public void buildPartThree();
    public Product getProduct();
}
