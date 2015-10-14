/**
 * Created by Jack on 10/13/15.
 */
public class Character {
    String name;
    int health;
    int damage;
    Weapon weapon;

    void battle(Character opponent) { //method called battle, pass in argument opponnent
        System.out.println(String.format("%s commences battle with %s!", name, opponent.name));

        while (health > 0  && opponent.health > 0) {  //While health is less than zero or opponent health is less than zero
            health -= opponent.damage + opponent.weapon.damage;
            opponent.health -= damage + weapon.damage;
            System.out.println(String.format("%s's health: %d, %s's health: %d", name, health, opponent.name, opponent.health));
        }

        String deadMessage = ("%s has been killed!");

        if (health <= 0) {
            System.out.println(String.format(deadMessage, name));
        }

        if (opponent.health <= 0) {
            System.out.println(String.format(deadMessage, opponent.name));
        }
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public int getDamage() {
        return damage;
    }

    public Weapon getWeapon() {
        return weapon;
    }
}
