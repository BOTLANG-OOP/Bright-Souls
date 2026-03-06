/**
 * Author: Hynes
 */
package com.rpg.enemies;

import com.rpg.core.Enemy;
import com.rpg.core.Character;

public class Dragon extends Enemy {
    
    public Dragon() {
        super("Bahamut", 200, 60, 20, 100, 80);
    }

    @Override
    public void performAttack(Character target){
        int damage = (int)(getAttack() * 2);
        System.out.println("Alduin attacks and breathes fire on "+target.getName()+"! for "+ damage+" damage!");
    }
}

