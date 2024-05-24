package org.isp;

import java.util.ArrayList;
import java.util.List;

public class Restaurant {
    private int restaurantId;
    private String nume;
    private Meniu meniu;
    private String adresa;

    public Restaurant(int restaurantId, String nume, Meniu meniu, String adresa) {
        this.restaurantId = restaurantId;
        this.nume = nume;
        this.meniu = meniu; // Assuming Meniu holds a list of ItemMenu
        this.adresa = adresa;
    }

    public boolean acceptaComanda(Comanda comanda) {
        // Simplified check for menu items availability
        for (ItemMenu item : comanda.getItems()) {
            if (!meniu.contains(item)) {
                System.out.println("Item " + item.getNume() + " not available in the menu.");
                return false;
            }
        }
        System.out.println("Comanda a fost acceptata de restaurantul: " + this.nume);
        return true;
    }

    public void pregatesteComanda(Comanda comanda) {
        if (acceptaComanda(comanda)) {
            System.out.println("Comanda este în curs de pregatire la restaurantul: " + this.nume);
            comanda.setStare(StareComanda.PREPARED);
        } else {
            System.out.println("Comanda nu poate fi pregătită deoarece unul sau mai multe articole nu sunt disponibile.");
        }
    }

    public void actualizeazaMeniu(ItemMenu item, boolean add) {
        if (add) {
            meniu.addItem(item);
            System.out.println("Item-ul " + item.getNume() + " a fost adăugat în meniu.");
        } else {
            meniu.removeItem(item);
            System.out.println("Item-ul " + item.getNume() + " a fost eliminat din meniu.");
        }
    }

    // Getters and setters
    public int getRestaurantId() {
        return restaurantId;
    }

    public void setRestaurantId(int restaurantId) {
        this.restaurantId = restaurantId;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public Meniu getMeniu() {
        return meniu;
    }

    public void setMeniu(Meniu meniu) {
        this.meniu = meniu;
    }

    public String getAdresa() {
        return adresa;
    }

    public void setAdresa(String adresa) {
        this.adresa = adresa;
    }
}
