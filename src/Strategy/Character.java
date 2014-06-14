package Strategy;

/**
 * Created by Jonathan on 6/14/2014.
 */
public abstract class Character {
    IWeapon weapon;
    int health;
    String name;

    public abstract void Attack(Character target);

    public void changeWeapon(IWeapon weapon){
        this.weapon = weapon;
    }
}
