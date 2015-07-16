package factory.examples.ships;

/**
 * Created by luisburgos on 16/07/15.
 */
public abstract class Ship {

    private String name;
    private double speed;
    private double damage;

    public Ship() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public double getDamage() {
        return damage;
    }

    public void setDamage(double damage) {
        this.damage = damage;
    }

    @Override
    public String toString() {
        return "Name: " + getName() + "| Damage: " + String.format("%.2f", getDamage()) + "| Speed:" + String.format("%.2f", getSpeed());
    }
}
