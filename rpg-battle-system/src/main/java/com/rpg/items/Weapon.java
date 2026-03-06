/**
 * Author: hanz
 */
package com.rpg.items;

import com.rpg.core.Hero;

public class Weapon extends Item {
    private int attackBoost;


    //def weap
    public Weapon(int attackBoost) {
        super("Basic Sword", "A sharp blade that increases attack power.");
        this.attackBoost = attackBoost;
    }

    public Weapon(String weaponName, int attackBoost) {
        super(weaponName, "A weapon that increases attack power.");
        this.attackBoost = attackBoost;
    }

    @Override
    public void use(Hero hero) {

        int newAttack = hero.getAttack() + attackBoost;
        hero.setAttack(newAttack);
        System.out.println(">>> " + hero.getName() + " equipped " + name + "!");
        System.out.println(">>> Attack increased by " + attackBoost + ". (Total: " + newAttack + ")");
    }
}