package org.isp;

public class Plata {
    private int plataId;
    private Comanda comanda;
    private int suma;
    private MetodaPlata metoda;
    private String stare;

    public Plata(int plataId, Comanda comanda, int suma, MetodaPlata metoda, String stare) {
        this.plataId = plataId;
        this.comanda = comanda;
        this.suma = suma;
        this.metoda = metoda;
        this.stare = stare;
    }

    public void proceseazaPlata() {
        // Implementatie simpla pentru procesarea unei plati
        System.out.println("Plata cu ID-ul: " + this.plataId + " a fost procesata.");
    }

    // Getters si Setters
    public int getPlataId() {
        return plataId;
    }

    public void setPlataId(int plataId) {
        this.plataId = plataId;
    }

    public Comanda getComanda() {
        return comanda;
    }

    public void setComanda(Comanda comanda) {
        this.comanda = comanda;
    }

    public int getSuma() {
        return suma;
    }

    public void setSuma(int suma) {
        this.suma = suma;
    }

    public MetodaPlata getMetoda() {
        return metoda;
    }

    public void setMetoda(MetodaPlata metoda) {
        this.metoda = metoda;
    }

    public String getStare() {
        return stare;
    }

    public void setStare(String stare) {
        this.stare = stare;
    }
}
