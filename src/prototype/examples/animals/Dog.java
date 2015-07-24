package prototype.examples.animals;

/**
 * Created by luisburgos on 23/07/15.
 */
public class Dog implements Animal {
    @Override
    public Animal clone() {
        Dog dogClone = null;

        try {
            dogClone = (Dog) super.clone();
        }
        catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        return dogClone;
    }

    public String toString(){
        return "This is a Dog";
    }

}
