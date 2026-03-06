/**
 * Author: TBD
 */
package com.rpg.heroes;

import com.rpg.core.Hero;

public class Archer extends Hero {
    public Archer(String n, int h, int a) {
        super(n, h, a);
    }

    @Override
    public void performAttack() {
        System.out.println(getName() + " fires a steady shot!");
    }

    @Override
    public void useSpecialAbility() {
        double d = getAttack() * 0.75;
        System.out.println(getName() + " uses Double Shot for " + d + " damage twice!");
    }
}

