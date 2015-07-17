package abstractfactory.examples.ufo.products;

import abstractfactory.examples.ufo.factories.ShipFactory;
import abstractfactory.examples.ufo.factories.UFOShipFactory;

/**
 * Created by luisburgos on 17/07/15.
 */
public class UFOShip extends Ship {

    private ShipFactory shipFactory;

    public UFOShip(){
        setName("UFO Ship");
        this.shipFactory = new UFOShipFactory();
    }

    @Override
    public void makeShip(){
        System.out.println("Making new " + getName());
        setShipEngine(shipFactory.makeShipEngine());
        setShipWeapon(shipFactory.makeShipGun());
    }

}
