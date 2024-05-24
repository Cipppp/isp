package org.isp;

import java.util.List;
import java.util.ArrayList;

public class Meniu {
    private int meniuId;
    private List<ItemMenu> items;

    public Meniu(int meniuId, List<ItemMenu> items) {
        this.meniuId = meniuId;
        this.items = new ArrayList<>(items); // Copy constructor for encapsulation
    }

    public void addItem(ItemMenu item) {
        if (!items.contains(item)) {
            items.add(item);
            System.out.println("Item-ul " + item.getNume() + " a fost adăugat în meniu.");
        } else {
            System.out.println("Item-ul " + item.getNume() + " este deja în meniu.");
        }
    }

    public void removeItem(ItemMenu item) {
        if (items.contains(item)) {
            items.remove(item);
            System.out.println("Item-ul " + item.getNume() + " a fost eliminat din meniu.");
        } else {
            System.out.println("Item-ul " + item.getNume() + " nu a fost găsit în meniu.");
        }
    }

    public boolean contains(ItemMenu item) {
        return items.contains(item);
    }

    public int getMeniuId() {
        return meniuId;
    }

    public void setMeniuId(int meniuId) {
        this.meniuId = meniuId;
    }

    public List<ItemMenu> getItems() {
        return new ArrayList<>(items); // Return a copy for encapsulation
    }

    public void setItems(List<ItemMenu> items) {
        this.items = new ArrayList<>(items); // Copy the input for encapsulation
    }
}
