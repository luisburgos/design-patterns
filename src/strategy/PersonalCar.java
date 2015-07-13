package strategy;

/**
 * Created by luisburgos on 12/07/15.
 */
public class PersonalCar implements TransportationMode {

    @Override
    public String travel() {
        return "Traveling to Airport in: PersonalCar";
    }

}
