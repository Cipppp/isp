package org.isp;

public class Curier {
    private int curierId;
    private String nume;
    private String telefon;
    private String vehicul;

    public Curier(int curierId, String nume, String telefon, String vehicul) {
        this.curierId = curierId;
        this.nume = nume;
        this.telefon = telefon;
        this.vehicul = vehicul;
    }

    public void actualizeazăLocație(String locatie) {
        // Implementație simplă pentru actualizarea locației
        System.out.println("Locația livratorului " + this.nume + " a fost actualizată la: " + locatie);
    }

    public void livreazăComandă(Comanda comanda) {
        // Implementație simplă pentru livrarea unei comenzi
        System.out.println("Livratorul " + this.nume + " livrează comanda cu ID-ul: " + comanda.getComandaId());
    }

    public int getLivratorId() {
        return curierId;
    }

    public void setLivratorId(int livratorId) {
        this.curierId = livratorId;
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

    public String getVehicul() {
        return vehicul;
    }

    public void setVehicul(String vehicul) {
        this.vehicul = vehicul;
    }
}
