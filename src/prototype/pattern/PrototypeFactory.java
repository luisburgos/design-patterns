package prototype.pattern;

/**
 * Created by luisburgos on 23/07/15.
 */
public class PrototypeFactory {

    public Prototype getClone(Prototype proto){
        return proto.clone();
    }

}
