/**
 * Author: Hanz
 */
package com.rpg.items;

import com.rpg.core.Hero;

public class Potion extends Item {
    private int healAmount;

    //im assuming potion heals up hp uwu, pls criticize if you think otherwise

    public Potion(int healAmount) {
        super("Health Potion", "Restores physical health.");
        this.healAmount = healAmount;
    }

    @Override
    public void use(Hero hero) {
        
        int newHp = Math.min(hero.getHp() + healAmount, hero.getMaxHp());
        int actual = newHp - hero.getHp();
        hero.setHp(newHp);
        System.out.println(">>> " + hero.getName() + " drank " + name + "!");
        System.out.println(">>> Restored " + actual + " HP. (" + hero.getHp() + "/" + hero.getMaxHp() + " HP)");
    }
}
