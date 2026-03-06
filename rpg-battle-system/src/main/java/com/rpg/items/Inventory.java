/**
 * Author: Hanz
 */
package com.rpg.items;

import com.rpg.core.Hero;
import java.util.ArrayList;
import java.util.List;

public class Inventory {
    private List<Item> items;

    public Inventory() {
        this.items = new ArrayList<>();
    }

    public void addItem(Item item) {
        items.add(item);
        System.out.println("Item added to inventory: " + item.getName());
    }

    public void displayItems() {
        System.out.println("--- Your Inventory ---");
        if (items.isEmpty()) {
            System.out.println("Inventory is empty!");
        } else {
            for (int i = 0; i < items.size(); i++) {
                Item item = items.get(i);
                System.out.println(i + ". [" + item.getName() + "]: " + item.getDescription());
            }
        }
    }

    public void useItem(int index, Hero hero) {
        if (index >= 0 && index < items.size()) {
            Item itemToUse = items.get(index);
            itemToUse.use(hero);
            
            items.remove(index);
        } else {
            System.out.println("Invalid item selection!");
        }
    }
}
