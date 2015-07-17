package abstractfactory.examples.ufo.factories;

import abstractfactory.examples.ufo.parts.ShipEngine;
import abstractfactory.examples.ufo.parts.ShipWeapon;
import abstractfactory.examples.ufo.parts.UFOEngine;
import abstractfactory.examples.ufo.parts.UFOGun;

/**
 * Created by luisburgos on 16/07/15.
 */
public class UFOShipFactory extends ShipFactory {
    @Override
    public ShipWeapon makeShipGun() {
        return new UFOGun();
    }

    @Override
    public ShipEngine makeShipEngine() {
        return new UFOEngine();
    }
}
