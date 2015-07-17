package abstractfactory.examples.ufo.parts;

/**
 * Created by luisburgos on 16/07/15.
 */
public class UFOGun implements ShipWeapon {
    @Override
    public String getShipWeaponInformation() {
        return "20 damage";
    }
}
