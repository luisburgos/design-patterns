package abstractfactory.examples.ufo.parts;

/**
 * Created by luisburgos on 16/07/15.
 */
public class UFOEngine implements ShipEngine {
    @Override
    public String getShipEngineInformation() {
        return "1000 mph";
    }
}
