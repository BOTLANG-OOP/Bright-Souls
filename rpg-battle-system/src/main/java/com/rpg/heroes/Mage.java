/**
 * Author: TBD
 */
package com.rpg.heroes;

import com.rpg.core.Hero;

public class Mage extends Hero {
    public Mage(String n, int h, int a) {
        super(n, h, a);
    }

    @Override
    public void performAttack() {
        System.out.println(getName() + " casts a magic bolt!");
    }

    @Override
    public void useSpecialAbility() {
        double d = getAttack() * 1.5;
        System.out.println(getName() + " casts Fireball for " + d + " damage!");
    }
}
