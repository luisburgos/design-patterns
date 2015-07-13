package strategy;

/**
 * Created by luisburgos on 12/07/15.
 */
public class CityBus implements  TransportationMode {

    @Override
    public String travel() {
        return "Traveling to Airport in: CityBus";
    }

}
