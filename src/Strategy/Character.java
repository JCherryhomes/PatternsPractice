package Strategy;

/**
 * Created by Jonathan on 6/14/2014.
 */
public abstract class Character {
    IWeapon weapon;
    int health;
    Character target;
    String name;

    public abstract void Attack();

    public void changeWeapon(IWeapon weapon){
        this.weapon = weapon;
    }

    public void setTarget(Character target){
        this.target = target;
    }
}
