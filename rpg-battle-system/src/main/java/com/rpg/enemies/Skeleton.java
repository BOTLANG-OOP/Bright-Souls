/**
 * Author: Hynes
 */
package com.rpg.enemies;

import com.rpg.core.Enemy;
import com.rpg.core.Character;

public class Skeleton extends Enemy {

    public Skeleton(){
        super("Skrall", 90, 30, 10, 50, 30);
    }

    @Override
    public void performAttack(Character target) {
        int damage = (int)(getAttack());

        System.out.println("Skrall shot "+target.getName()+" with an arrow! for "+damage+" damage!");
        target.takeDamage(damage);

        Regenerate();
    }

    public void Regenerate(){
       setHp(getHp()+5);
       System.out.println("Skrall regenerates 5 HP!");
    }


}
