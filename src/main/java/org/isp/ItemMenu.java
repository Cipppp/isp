package org.isp;

public class ItemMenu {
    private int itemId;
    private String nume;
    private String descriere;
    private int pret;

    public ItemMenu(int itemId, String nume, String descriere, int pret) {
        this.itemId = itemId;
        this.nume = nume;
        this.descriere = descriere;
        this.pret = pret;
    }

    public void actualizeazăPreț(int pret) {
        this.pret = pret;
        System.out.println("Pretul item-ului " + this.nume + " a fost actualizat la: " + pret);
    }


    public int getItemId() {
        return itemId;
    }

    public void setItemId(int itemId) {
        this.itemId = itemId;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getDescriere() {
        return descriere;
    }

    public void setDescriere(String descriere) {
        this.descriere = descriere;
    }

    public int getPreț() {
        return pret;
    }

    public void setPreț(int pret) {
        this.pret = pret;
    }
}
