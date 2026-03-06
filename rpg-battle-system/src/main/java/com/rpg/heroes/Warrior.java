/**
 * Author: TBD
 */
package com.rpg.heroes;

import com.rpg.core.Character;
import com.rpg.core.Hero;

public class Warrior extends Hero {

    public Warrior(String name, int hp, int attack, int defense) {
        super(name, hp, attack, defense);
    }

    @Override
    public void performAttack(Character target) {
        System.out.println(getName() + " slashes " + target.getName() + "!");
        target.takeDamage(getAttack());
    }

    @Override
    public void useSpecialAbility(Character target) {
        int damage = (int)(getAttack() * 0.5);
        System.out.println(getName() + " uses Shield Bash on " + target.getName() + "! (" + damage + " damage, enemy is stunned!)");
        target.takeDamage(damage);
    }
}
