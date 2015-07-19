package composite.examples.directories;

/**
 * Created by luisburgos on 18/07/15.
 */
public class SimpleFile extends File {

    public SimpleFile(String name) {
        this.name = name;
    }

    @Override
    public void showInfo() {
        System.out.print(identado.toString() + "-Simple File: " + getName() + "\n");
    }
}
