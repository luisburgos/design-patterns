package prototype.examples.animals;

/**
 * Created by luisburgos on 23/07/15.
 */
public class AnimalCloneFactory {

    public Animal getClone(Animal animalSample) {
        return animalSample.clone();
    }

}
