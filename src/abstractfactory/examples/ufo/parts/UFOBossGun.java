package abstractfactory.examples.ufo.parts;

/**
 * Created by luisburgos on 16/07/15.
 */
public class UFOBossGun implements ShipWeapon {
    @Override
    public String getShipWeaponInformation() {
        return "50 damage";
    }
}
