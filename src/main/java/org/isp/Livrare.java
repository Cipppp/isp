package org.isp;

public class Livrare {
    private int livrareId;
    private Comanda comanda;
    private Curier curier;
    private String stare;
    private String locatieCurenta;

    public Livrare(int livrareId, Comanda comanda, Curier curier, String stare, String locatieCurenta) {
        this.livrareId = livrareId;
        this.comanda = comanda;
        this.curier = curier;
        this.stare = stare;
        this.locatieCurenta = locatieCurenta;
    }

    public void actualizeazaStare(String stare) {
        this.stare = stare;
        System.out.println("Starea livrării a fost actualizata la: " + stare);
    }

    public void actualizeazaLocatie(String locatie) {
        this.locatieCurenta = locatie;
        System.out.println("Locatia curenta a livrarii a fost actualizata la: " + locatie);
    }


    public int getLivrareId() {
        return livrareId;
    }

    public void setLivrareId(int livrareId) {
        this.livrareId = livrareId;
    }
    
    public Comanda getComanda() {
        return comanda;
    }

    public void setComanda(Comanda comanda) {
        this.comanda = comanda;
    }

    public Curier getCurier() {
        return curier;
    }

    public void setLivrator(Curier curier) {
        this.curier = curier;
    }

    public String getStare() {
        return stare;
    }

    public void setStare(String stare) {
        this.stare = stare;
    }

    public String getLocațieCurentă() {
        return locatieCurenta;
    }

    public void setLocațieCurentă(String locațieCurentă) {
        this.locatieCurenta = locațieCurentă;
    }
}
