package command.examples.spells;

import command.examples.spells.commands.Age;
import command.examples.spells.commands.Size;
import command.examples.spells.commands.Visibility;

/**
 * Created by luisburgos on 14/08/15.
 */
public abstract class Target {

    private Size size;
    private Visibility visibility;
    private Age age;

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public Visibility getVisibility() {
        return visibility;
    }

    public void setVisibility(Visibility visibility) {
        this.visibility = visibility;
    }

    public Age getAge() {
        return age;
    }

    public void setAge(Age age) {
        this.age = age;
    }

    @Override
    public abstract String toString();

    public void printStatus() {
        System.out.println(String.format("%s, Size: %s | Visibility: %s | Age: %s \n", this,
                getSize(), getVisibility(), getAge()));
    }

}
