package com.danhammant;

import java.util.HashMap;
import java.util.Map;


public class Refrigerator {
    private Map<Item, Integer> items;
    private Dimensions dimensions;

    public Refrigerator(Dimensions dimensions) {
        this.dimensions = dimensions;
        this.items = new HashMap<>();
    }

    public void addItem(Item item, int amount) {
        if (items.containsKey(item)) {
            int originalAmount = items.get(item);
            items.put(item, originalAmount + amount);
        } else {
            items.put(item, amount);
        }

        System.out.println("Item(s) added.");
    }

    public void removeItem(Item item, int amount) {
        if (!items.containsKey(item)) {
            System.out.println("Item not in the fridge.");
        } else {
            int originalAmount = items.get(item);

            if (originalAmount - amount <= 0) {
                System.out.println("Item(s) removed.  Out of item." );
                return;
            }

            items.put(item, originalAmount - amount);
            System.out.println("Item(s) removed.");
        }
    }

    public String amountOfItemsInFridge() {
        int amount = 0;

        for(Item item : items.keySet()) {
            amount += items.get(item);
        }

        return "There are " + amount + " items in the fridge.";
    }


}
