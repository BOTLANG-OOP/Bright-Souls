/**
 * Author: Kharl
 */
package com.rpg.core;

import com.rpg.items.Inventory;

public abstract class Hero extends Character {

    private int level;
    private int experience;
    private Inventory inventory;

    public Hero(String name, int hp, int attack, int defense) {
        super(name, hp, attack, defense);
        this.level = 1;
        this.experience = 0;
        this.inventory = new Inventory();
    }

    public abstract void useSpecialAbility(Character target);

    public void gainExperience(int xp) {
        setExperience(getExperience() + xp);
        System.out.println(getName() + " gained " + xp + " XP! (Total: " + getExperience() + " XP)");
    }

    // Getters
    public int getLevel() { return level; }
    public int getExperience() { return experience; }
    public Inventory getInventory() { return inventory; }

    // Setters
    public void setLevel(int level) { this.level = level; }
    public void setExperience(int experience) { this.experience = experience; }
}
