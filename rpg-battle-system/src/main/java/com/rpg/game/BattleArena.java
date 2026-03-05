/**
 * Author: TBD
 */
package com.rpg.game;

import com.rpg.core.Hero;
import com.rpg.core.Enemy;
import com.rpg.heroes.Warrior;

import java.util.Scanner;

public class BattleArena {

    private Hero hero;
    private Enemy enemy;
    private boolean enemyStunned = false;
    private int turnCount;

    public BattleArena(Hero hero, Enemy enemy) {
        this.hero = hero;
        this.enemy = enemy;
        this.turnCount = 0;
    }

    public void startBattle() {
        Scanner scanner = new Scanner(System.in);
        boolean heroWon = false;

        while (true) {
            turnCount++;
            System.out.println("=== Turn " + turnCount + " ===");
            hero.displayStats();
            enemy.displayStats();

            // Hero turn
            System.out.println("1. Attack  2. Special Ability  3. Use Item");
            String input = scanner.nextLine().trim();

            switch (input) {
                case "1":
                    hero.performAttack(enemy);
                    break;
                case "2":
                    hero.useSpecialAbility(enemy);
                    if (hero instanceof Warrior) {
                        enemyStunned = true;
                    }
                    break;
                case "3":
                    hero.getInventory().displayItems();
                    System.out.println("Enter item index to use:");
                    String indexInput = scanner.nextLine().trim();
                    try {
                        int index = Integer.parseInt(indexInput);
                        hero.getInventory().useItem(index, hero);
                    } catch (NumberFormatException e) {
                        System.out.println("Invalid item index.");
                    }
                    break;
                default:
                    System.out.println("Invalid input. Turn wasted!");
                    break;
            }

            if (!enemy.isAlive()) {
                heroWon = true;
                break;
            }

            // Enemy turn
            if (enemyStunned) {
                System.out.println("[" + enemy.getName() + "] is stunned and skips their turn!");
                enemyStunned = false;
            } else {
                enemy.performAttack(hero);
            }

            if (!hero.isAlive()) {
                break;
            }
        }

        if (heroWon) {
            System.out.println("You defeated " + enemy.getName() + "!");
            hero.gainExperience(enemy.getRewardXP());
            System.out.println("Gold rewarded: " + enemy.getRewardGold());
            hero.displayStats();
        } else {
            System.out.println("Game Over! You survived " + turnCount + " turn(s).");
        }
    }
}
