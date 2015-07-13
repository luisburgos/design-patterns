package strategy.examples.transportation;

/**
 * Created by luisburgos on 12/07/15.
 */
public class Taxi implements TransportationMode {

    @Override
    public String travel() {
        return "Traveling to Airport in: Taxi";
    }

}
