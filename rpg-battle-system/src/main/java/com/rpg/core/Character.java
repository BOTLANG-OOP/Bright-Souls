/**
 * Author: Kharl
 */
package com.rpg.core;

public abstract class Character {

    private String name;
    private int hp;
    private int maxHp;
    private int attack;
    private int defense;

    public Character(String name, int hp, int attack, int defense) {
        this.name = name;
        this.hp = hp;
        this.maxHp = hp;
        this.attack = attack;
        this.defense = defense;
    }

    public abstract void performAttack(Character target);

    public void takeDamage(int amount) {
        int actual = Math.max(0, amount - getDefense());
        setHp(Math.max(0, getHp() - actual));
        System.out.println(getName() + " takes " + actual + " damage! (" + getHp() + "/" + getMaxHp() + " HP remaining)");
    }

    public boolean isAlive() {
        return getHp() > 0;
    }

    public void displayStats() {
        System.out.println("=== " + getName() + " ===");
        System.out.println("  HP     : " + getHp() + "/" + getMaxHp());
        System.out.println("  Attack : " + getAttack());
        System.out.println("  Defense: " + getDefense());
    }

    // Getters
    public String getName() { return name; }
    public int getHp() { return hp; }
    public int getMaxHp() { return maxHp; }
    public int getAttack() { return attack; }
    public int getDefense() { return defense; }

    // Setters
    public void setName(String name) { this.name = name; }
    public void setHp(int hp) { this.hp = hp; }
    public void setMaxHp(int maxHp) { this.maxHp = maxHp; }
    public void setAttack(int attack) { this.attack = attack; }
    public void setDefense(int defense) { this.defense = defense; }
}
