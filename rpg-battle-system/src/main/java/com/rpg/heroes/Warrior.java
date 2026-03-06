/**
 * Author: TBD
 */
package com.rpg.heroes;

import com.rpg.core.Hero;

public class Warrior extends Hero {
    public Warrior(String n, int h, int a) {
        super(n, h, a);
    }

    @Override
    public void performAttack() {
        System.out.println(getName() + " swings a heavy sword!");
    }

    @Override
    public void useSpecialAbility() {
        System.out.println(getName() + " uses Shield Bash! The enemy is stunned and skips their next turn.");
    }
}
  
