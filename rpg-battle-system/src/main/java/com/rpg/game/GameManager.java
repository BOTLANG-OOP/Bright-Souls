/**
 * Author: TBD
 */
package com.rpg.game;

import com.rpg.core.Hero;
import com.rpg.core.Enemy;
import com.rpg.heroes.Warrior;
import com.rpg.heroes.Mage;
import com.rpg.heroes.Archer;
import com.rpg.enemies.Goblin;
import com.rpg.enemies.Dragon;
import com.rpg.enemies.Skeleton;
import com.rpg.items.Weapon;
import com.rpg.items.Potion;

import java.util.Scanner;

public class GameManager {

    public static void main(String[] args) {
        System.out.println("██████╗  █████╗ ██████╗ ██╗  ██╗███████╗ ██████╗ ██╗   ██╗██╗     ███████╗    ██╗██████╗ ");
        System.out.println("██╔══██╗██╔══██╗██╔══██╗██║ ██╔╝██╔════╝██╔═══██╗██║   ██║██║     ██╔════╝   ██╔╝██╔══██╗");
        System.out.println("██║  ██║███████║██████╔╝█████╔╝ ███████╗██║   ██║██║   ██║██║     ███████╗  ██╔╝ ██████╔╝");
        System.out.println("██║  ██║██╔══██║██╔══██╗██╔═██╗ ╚════██║██║   ██║██║   ██║██║     ╚════██║ ██╔╝  ██╔══██╗");
        System.out.println("██████╔╝██║  ██║██║  ██║██║  ██╗███████║╚██████╔╝╚██████╔╝███████╗███████║██╔╝   ██║  ██║");
        System.out.println("╚═════╝ ╚═╝  ╚═╝╚═╝  ╚═╝╚═╝  ╚═╝╚══════╝ ╚═════╝  ╚═════╝ ╚══════╝╚══════╝╚═╝    ╚═╝  ╚═╝");
        System.out.println("                                                                                    Jr.");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose your hero:");
        System.out.println("1. Warrior - High defense, can stun enemies");
        System.out.println("2. Mage    - High attack, unleashes Fireball");
        System.out.println("3. Archer  - Balanced, attacks twice with Double Shot");
        String heroChoice = scanner.nextLine().trim();

        System.out.println("Enter your hero's name:");
        String heroName = scanner.nextLine().trim();

        Hero hero;
        switch (heroChoice) {
            case "2":
                hero = new Mage(heroName, 80, 50, 10);
                break;
            case "3":
                hero = new Archer(heroName, 100, 40, 15);
                break;
            default:
                hero = new Warrior(heroName, 120, 30, 20);
                break;
        }

        hero.getInventory().addItem(new Weapon(10));
        hero.getInventory().addItem(new Potion(30));

        System.out.println("Choose your enemy:");
        System.out.println("1. Goblin  - Weak but attacks twice");
        System.out.println("2. Dragon  - Boss tier, hits extremely hard");
        System.out.println("3. Skeleton - Regenerates HP each turn");
        String enemyChoice = scanner.nextLine().trim();

        Enemy enemy;
        switch (enemyChoice) {
            case "2":
                enemy = new Dragon("Dragon", 200, 60, 20, 100, 80);
                break;
            case "3":
                enemy = new Skeleton("Skeleton", 90, 30, 10, 50, 30);
                break;
            default:
                enemy = new Goblin("Goblin", 60, 20, 5, 30, 15);
                break;
        }

        BattleArena arena = new BattleArena(hero, enemy);
        arena.startBattle();

        scanner.close();
    }
}
