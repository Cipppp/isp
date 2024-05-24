package org.isp;

import java.util.List;

public class Client {
    private int client_id; // Adjusted to match the UML diagram
    private String nume;
    private String telefon;
    private String adresa;

    public Client(int client_id, String nume, String telefon, String adresa) {
        this.client_id = client_id;
        this.nume = nume;
        this.telefon = telefon;
        this.adresa = adresa;
    }

    public Comanda plasareComanda(Restaurant restaurant, List<ItemMenu> items, int total, Livrare livrare, Plata plata) {
        Comanda comanda = new Comanda(1, this, restaurant, items, total, StareComanda.NEW, livrare, plata);
        if (restaurant.acceptaComanda(comanda)) {
            System.out.println("Comanda a fost plasata de clientul: " + this.nume);
            return comanda;
        } else {
            System.out.println("Comanda nu a fost acceptata de restaurant.");
            return null; // or handle this case appropriately
        }
    }

    public Comanda urmarireComanda(int comandaId, List<Comanda> comenzi) {
        for (Comanda comanda : comenzi) {
            if (comanda.getComandaId() == comandaId) {
                System.out.println("Urmarirea comenzii cu ID-ul: " + comandaId);
                return comanda;
            }
        }
        System.out.println("Comanda cu ID-ul: " + comandaId + " nu a fost gasita.");
        return null;
    }

    public void anulareComanda(Comanda comanda) {
        comanda.actualizeazaStare(StareComanda.CANCELLED);
        System.out.println("Comanda cu ID-ul: " + comanda.getComandaId() + " a fost anulata.");
    }

    public void lasaRecenzie(Comanda comanda, String recenzie) {
        System.out.println("Recenzia pentru comanda cu ID-ul: " + comanda.getComandaId() + " a fost lasata.");
    }

    // Getters and setters
    public int getClientId() {
        return client_id;
    }

    public void setClientId(int client_id) {
        this.client_id = client_id;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getTelefon() {
        return telefon;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }

    public String getAdresa() {
        return adresa;
    }

    public void setAdresa(String adresa) {
        this.adresa = adresa;
    }
}
