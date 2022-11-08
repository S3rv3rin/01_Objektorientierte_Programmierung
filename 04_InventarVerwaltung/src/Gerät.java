import java.text.DecimalFormat;

public class Gerät {
    private double preis;
    private String bezeichnung;
    private String kategorie;
    private int baujahr;
    private boolean bezahltStatus;
    private int id;

    public Gerät(int id, String bezeichnung, String kategorie, double preis, int baujahr, boolean bezahltStatus) {
        this.preis = preis;
        this.bezeichnung = bezeichnung;
        this.kategorie = kategorie;
        this.baujahr = baujahr;
        this.bezahltStatus = bezahltStatus;
        this.id = id;
    }
    public static int GeräteID = 10;
    public double getPreis() {
        return preis;
    }

    public void setPreis(double preis) {
        this.preis = preis;
    }

    public String getBezeichnung() {
        return bezeichnung;
    }

    public void setBezeichnung(String bezeichnung) {
        this.bezeichnung = bezeichnung;
    }

    public String getKategorie() {
        return kategorie;
    }

    public void setKategorie(String kategorie) {
        this.kategorie = kategorie;
    }

    public int getBaujahr() {
        return baujahr;
    }

    public void setBaujahr(int baujahr) {
        this.baujahr = baujahr;
    }

    public boolean isBezahltStatus() {
        return bezahltStatus;
    }

    public void setBezahltStatus(boolean bezahltStatus) {
        this.bezahltStatus = bezahltStatus;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        id = id;
    }

    @Override
    public String toString() {
        DecimalFormat nf = new DecimalFormat("#,##0.00€");
        return "#"+ id + ">>\t" +
                "Bezeichnung: " + bezeichnung +
                ", Typ: " + kategorie +
                ", Preis: " + nf.format(preis) +
                ", Baujahr: " + baujahr +
                ", bezahlt: " + (bezahltStatus ? "ja" : "nein");

    }
}
