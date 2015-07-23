package builder.examples.heroes;

/**
 * Created by luisburgos on 22/07/15.
 */
public class Hero {

    private String name;
    private Profession profession;
    private Armor armor;
    private Weapon weapon;

    public Hero(){

    }

    public void setName(String name) {
        this.name = name;
    }

    public void setProfession(Profession profession) {
        this.profession = profession;
    }

    public void setArmor(Armor armor) {
        this.armor = armor;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public Profession getProfession() {
        return profession;
    }

    public String getName() {
        return name;
    }

    public Armor getArmor() {
        return armor;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();
        sb.append("This is a ");
        sb.append(profession);
        sb.append(" named ");
        sb.append(name);

        if (armor != null) {
            sb.append(" wearing ");
            sb.append(armor);
        }
        if (weapon != null) {
            sb.append(" and wielding a ");
            sb.append(weapon);
        }

        sb.append(".");
        return sb.toString();
    }

}
