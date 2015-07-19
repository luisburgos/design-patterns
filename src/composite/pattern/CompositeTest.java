package composite.pattern;

/**
 * Created by luisburgos on 18/07/15.
 */
public class CompositeTest {

    public static void main(String[] args) {

        Component componentOne = new Composite("Composite One");
        Component componentTwo = new Composite("Composite Two");
        Component componentThree = new Composite("Composite Three");

        Component componentWrapper = new Composite("All components");

        componentWrapper.add(componentOne);
        componentWrapper.add(componentTwo);
        componentWrapper.add(componentThree);

        componentOne.add(new Leaf("ONE: Sub component one"));
        componentOne.add(new Leaf("ONE: Sub component two"));
        componentOne.add(new Leaf("ONE: Sub component three"));

        componentTwo.add(new Leaf("TWO: Sub component one"));
        componentTwo.add(new Leaf("TWO: Sub component two"));

        componentThree.add(new Leaf("THREE: Sub component one"));
        componentThree.add(new Leaf("THREE: Sub component two"));
        componentThree.add(new Leaf("THREE: Sub component three"));
        componentThree.add(new Leaf("THREE: Sub component four"));


        componentWrapper.doSomething();

    }

}
