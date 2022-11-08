public class Hauptprogramm {

    public static void main(String[] args) {

        System.out.println("Ich erstelle jetzt k1");
        Karte k1 = new Karte("grün", 8);

        System.out.println("Ich erstelle jetzt zweiteKarte");
        Karte zweiteKarte = new Karte(9, "blau");
        e
        Karte nochEinKarte = new Karte(7, "gelb", "European");

//        Karte gibbetNicht = new Karte("grün", "American");

        System.out.println("Jetzt kommt die Ausgabe:");
        System.out.println("Karte 1 : " + k1.wert);
        System.out.println("Karte 2 : " + zweiteKarte.farbe);
    }

}
