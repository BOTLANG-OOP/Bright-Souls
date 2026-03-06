/**
 * Author: Hynes
 */
package com.rpg.enemies;

import com.rpg.core.Enemy;
import com.rpg.core.Character;

public class Goblin extends Enemy {
    
    public Goblin(){
        super("Nebar", 60, 20, 5, 30, 15);
    }

    @Override
    public void performAttack(Character target){
        int damage = (int)(getAttack() * 0.6);

        System.out.println("Nebar throws stone on "+target.getName()+"! for "+damage+" damage!");
        target.takeDamage(damage);

        System.out.println("Nebar wails his club at"+target.getName()+"! for "+damage+" damage!");
        target.takeDamage(damage);
    }
}
