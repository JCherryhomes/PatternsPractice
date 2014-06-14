package Strategy;

/**
 * Created by Jonathan on 6/14/2014.
 */
public class Fighter extends Character {
    public Fighter(int health, IWeapon weapon, String name){
        this.health = health;
        this.weapon = weapon;
        this.name = name;
    }

    @Override
    public void Attack(Character target) {
        if (target == null){
            System.out.println("You have no target");
            return;
        }

        if (health <= 0){
            System.out.println(name + " cannot attack because (s)he is dead.");
            return;
        }

        target.health = target.health - weapon.getDamage();
        System.out.printf("%s did %d damage.%n", name, weapon.getDamage());
        System.out.println("Target Health: " + target.health);

        if (target.health <= 0){
            System.out.println("Target is dead");
            target = null;
        }
    }
}
