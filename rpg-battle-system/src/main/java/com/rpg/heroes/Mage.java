/**
 * Author: John
 */
package com.rpg.heroes;

import com.rpg.core.Character;
import com.rpg.core.Hero;

public class Mage extends Hero {
    public Mage(String name, int hp, int attack, int defense) {
        super(name, hp, attack, defense);
    }

    @Override
    public void performAttack(Character target) {
        System.out.println(getName() + " casts a magic bolt at " + target.getName() + "!");
        target.takeDamage(getAttack());
    }

    @Override
    public void useSpecialAbility(Character target) {
        int damage = (int)(getAttack() * 1.5);
        System.out.println(getName() + " launches Fireball at " + target.getName() + "! (" + damage + " damage!)");
        target.takeDamage(damage);
    }
}
