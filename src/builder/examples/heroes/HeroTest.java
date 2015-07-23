package builder.examples.heroes;

/**
 * Created by luisburgos on 22/07/15.
 */
public class HeroTest {

    public static void main(String[] args) {
        Hero mage = new HeroBuilder(Profession.MAGE, "Riobard")
                .withWeapon(Weapon.DAGGER)
                .build();
        System.out.println(mage);

        Hero warrior = new HeroBuilder(Profession.WARRIOR, "Amberjill")
                .withArmor(Armor.CHAIN_MAIL)
                .withWeapon(Weapon.SWORD).build();
        System.out.println(warrior);

        Hero thief = new HeroBuilder(Profession.THIEF, "Desmond")
                .withWeapon(Weapon.BOW).build();
        System.out.println(thief);
    }

}
