package abstractfactory.examples.ufo;

import abstractfactory.examples.ufo.factories.UFOBossShipFactory;
import abstractfactory.examples.ufo.products.Ship;
import abstractfactory.examples.ufo.products.UFOBossShip;
import abstractfactory.examples.ufo.products.UFOShip;


/**
 * Created by luisburgos on 17/07/15.
 */
public class ShipsAbstractFactoryTestDrive {

    public static void main(String[] args) {

        Ship ship;
        String typeShip;

        typeShip = "ufo";
        if(typeShip.equalsIgnoreCase("ufo")){
            ship = new UFOShip();
            ship.makeShip();
            System.out.println(ship.toString());
        }

        typeShip = "boss";
        if(typeShip.equalsIgnoreCase("boss")){
            ship = new UFOBossShip();
            ship.makeShip();
            System.out.println(ship.toString());
        }

    }

}
