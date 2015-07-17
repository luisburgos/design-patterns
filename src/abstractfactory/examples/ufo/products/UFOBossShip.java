package abstractfactory.examples.ufo.products;

import abstractfactory.examples.ufo.factories.ShipFactory;
import abstractfactory.examples.ufo.factories.UFOBossShipFactory;

/**
 * Created by luisburgos on 17/07/15.
 */
public class UFOBossShip extends Ship {

    private ShipFactory shipFactory;

    public UFOBossShip(){
        setName("UFO Boss Ship");
        this.shipFactory = new UFOBossShipFactory();
    }

    @Override
    public void makeShip(){
        System.out.println("Making new " + getName());
        setShipEngine(shipFactory.makeShipEngine());
        setShipWeapon(shipFactory.makeShipGun());
    }

}
