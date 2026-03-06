/**
 * Author: TBD
 */
package com.rpg.heroes;

import com.rpg.core.Character;
import com.rpg.core.Hero;

public class Archer extends Hero {
    public Archer(String n, int h, int a) {
        super(n, h, a);
    }

<<<<<<< HEAD
    @Override
    public void performAttack() {
        System.out.println(getName() + " fires a steady shot!");
    }

    @Override
    public void useSpecialAbility() {
        double d = getAttack() * 0.75;
        System.out.println(getName() + " uses Double Shot for " + d + " damage twice!");
=======
    public Archer(String name, int hp, int attack, int defense) {
        super(name, hp, attack, defense);
    }

    @Override
    public void performAttack(Character target) {
        System.out.println(getName() + " fires an arrow at " + target.getName() + "!");
        target.takeDamage(getAttack());
    }

    @Override
    public void useSpecialAbility(Character target) {
        int damage = (int)(getAttack() * 0.75);
        System.out.println(getName() + " uses Double Shot on " + target.getName() + "!");
        System.out.println("  -> First shot! (" + damage + " damage)");
        target.takeDamage(damage);
        System.out.println("  -> Second shot! (" + damage + " damage)");
        target.takeDamage(damage);
>>>>>>> staging
    }
}

