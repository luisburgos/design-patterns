package builder.pattern;

/**
 * Created by luisburgos on 22/07/15.
 */
public class Director {

    public void construct(Builder builder){
        builder.buildPart(); //For all objects in structure.
    }
}
