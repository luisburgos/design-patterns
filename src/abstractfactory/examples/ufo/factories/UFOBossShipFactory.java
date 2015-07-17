package abstractfactory.examples.ufo.factories;

import abstractfactory.examples.ufo.parts.ShipEngine;
import abstractfactory.examples.ufo.parts.ShipWeapon;
import abstractfactory.examples.ufo.parts.UFOBossEngine;
import abstractfactory.examples.ufo.parts.UFOBossGun;

/**
 * Created by luisburgos on 16/07/15.
 */
public class UFOBossShipFactory extends ShipFactory {
    @Override
    public ShipWeapon makeShipGun() {
        return new UFOBossGun();
    }

    @Override
    public ShipEngine makeShipEngine() {
        return new UFOBossEngine();
    }
}
