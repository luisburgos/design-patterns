package abstractfactory.examples.ufo.parts;

/**
 * Created by luisburgos on 16/07/15.
 */
public class UFOBossEngine implements ShipEngine {
    @Override
    public String getShipEngineInformation() {
        return "5000 mph";
    }
}
