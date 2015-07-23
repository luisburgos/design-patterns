package builder.pattern;

/**
 * Created by luisburgos on 22/07/15.
 */
public class Client {

    public static void main(String[] args) {

        Director director = new Director(new ConcreteBuilder());

        director.makeProduct();

        Product product = director.getProduct();

        System.out.println("Product part: " + product.getPartOne());
        System.out.println("Product part: " + product.getPartTwo());
        System.out.println("Product part: " + product.getPartThree());

    }

}
