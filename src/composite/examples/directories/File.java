package composite.examples.directories;

/**
 * Created by luisburgos on 18/07/15.
 */
public abstract class File {

    protected String name;
    protected static StringBuffer identado = new StringBuffer();

    public void add(File component) {
        throw new UnsupportedOperationException();
    }

    public void remove(File component) {
        throw new UnsupportedOperationException();
    }

    public String getName() {
        return name;
    }

    public void showInfo() {
        throw new UnsupportedOperationException();
    }

}
