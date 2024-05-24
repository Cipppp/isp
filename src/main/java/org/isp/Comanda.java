package org.isp;

import java.util.List;

public class Comanda {
    private int comandaId;
    private Client client;
    private Restaurant restaurant;
    private List<ItemMenu> items;
    private int total;
    private StareComanda stare;
    private Livrare livrare;
    private Plata plata;

    public Comanda(int comandaId, Client client, Restaurant restaurant, List<ItemMenu> items, int total, StareComanda stare, Livrare livrare, Plata plata) {
        this.comandaId = comandaId;
        this.client = client;
        this.restaurant = restaurant;
        this.items = items;
        this.total = total;
        this.stare = stare;
        this.livrare = livrare;
        this.plata = plata;
    }

    public void actualizeazaStare(StareComanda nouaStare) {
        this.stare = nouaStare;
        System.out.println("Starea comenzii #" + comandaId + " a fost actualizată la: " + nouaStare);
        if (nouaStare == StareComanda.DELIVERED) {
            this.plata.proceseazaPlata(); // Assuming that the payment is processed when order is delivered
        }
    }

    public void anuleazaComanda() {
        if (stare == StareComanda.NEW || stare == StareComanda.CONFIRMED) {
            actualizeazaStare(StareComanda.CANCELLED);
            System.out.println("Comanda #" + comandaId + " a fost anulată.");
        } else {
            System.out.println("Comanda #" + comandaId + " nu poate fi anulată în stadiul actual: " + stare);
        }
    }

    // Getters and Setters
    public int getComandaId() {
        return comandaId;
    }

    public void setComandaId(int comandaId) {
        this.comandaId = comandaId;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Restaurant getRestaurant() {
        return restaurant;
    }

    public void setRestaurant(Restaurant restaurant) {
        this.restaurant = restaurant;
    }

    public List<ItemMenu> getItems() {
        return items;
    }

    public void setItems(List<ItemMenu> items) {
        this.items = items;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public StareComanda getStare() {
        return stare;
    }

    public void setStare(StareComanda stare) {
        this.stare = stare;
    }

    public Livrare getLivrare() {
        return livrare;
    }

    public void setLivrare(Livrare livrare) {
        this.livrare = livrare;
    }

    public Plata getPlata() {
        return plata;
    }

    public void setPlata(Plata plata) {
        this.plata = plata;
    }
}
