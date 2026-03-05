/**
 * Author: Kharl
 */
package com.rpg.core;

public abstract class Enemy extends Character {

    private int rewardXP;
    private int rewardGold;

    public Enemy(String name, int hp, int attack, int defense, int rewardXP, int rewardGold) {
        super(name, hp, attack, defense);
        this.rewardXP = rewardXP;
        this.rewardGold = rewardGold;
    }

    public abstract void performAttack(Character target);

    // Getters
    public int getRewardXP() { return rewardXP; }
    public int getRewardGold() { return rewardGold; }
}
