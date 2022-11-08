import java.text.DecimalFormat;

public class InventarVerwaltung {
    /*
    * Attribute für die Klasse/Modell "Gerät":
    * - Preis           : double
    * - Bezeichnung     : String
    * - Kategorie       : String
    * - Baujahr         : int
    * - BezahltStatus   : boolean
    * - ID              : int
    *
    * Methoden für die Klasse/Model "Gerät"
    * + Konstruktor
    * + Getter/Setter für alle Attribute
    * + toString()
    * Ausgabe im Stil:
    *   "#1>>   Dell Monitor, Typ: Monitor, Preis: 150,00€, Baujahr:2013, bezahlt:ja"
    *   "#6>>   Dell Latidude 3350, Typ:Laptop, Preis:1599,99€, Baujahr:2017, bezahlt:nein"
    */
    /*
     * Folgende Geräte sollen in einer Liste verwaltet werden:
     *  1. Dell Monitor, Monitor, 150€, 2013, bezahlt
     *  2. HP Farblaserdrucker 123, Drucker, 245,95€, 2011, bezahlt
     *  3. Microsoft Ergonomic Tastatur, Tastatur, 99,99€ 2015, bezahlt
     *  4. LP Monitor 17 Zoll, Monitor, 139,12€, 2014, bezahlt
     *  5. Brother Printer Drucker, 180,95€, 2008, bezahlt
     *  6. Dell Latidude 3350, Laptop, 1599,99€ 2017, nicht bezahlt
     *  7. Optic Mouse, Maus, 25,22€, 2026, bezahlt
     *
     *  Aufgabe:
     *  Methoden schreiben:
     *   a) Ausgabe der kompletten Inventarliste, oder Hinweise, falls Liste leer
     *   b) Ausgabe der kompletten Inventarliste, jedoch nach Preis aufsteigend sortiert
     *   c) Ausgabe der noch nicht bezahlten Geräte, deren Kosten und Gesamtkosten
     * */

    private static final int MAX_ANZAHL_GERÄTE = 20; //Konstanten werden Groß geschrieben!
    private static int anzahlGeräte = 0;
    private static Gerät[] inventarListe = new Gerät[MAX_ANZAHL_GERÄTE];
    private static DecimalFormat nf = new DecimalFormat("#,##0.00€");

    public static void gerätHinzufügen(Gerät g){
        if (anzahlGeräte < inventarListe.length /*oder anzahlGeräte < MAX_ANZAHL_GERÄTE */) {
            inventarListe[anzahlGeräte] = g;
            anzahlGeräte++;
        } else System.err.println("Kann gerät nicht anlegen. Liste ist voll!");
    }


    // Ausgabe der gesamten Liste
    private static void ausgabeInventarListe() {
        System.out.println("gesamte Inventarliste");
        System.out.println("---------------------");
        if (anzahlGeräte == 0){
            System.out.println("keine Geräte vorhanden");

        }else {
            for (int i=0; i < anzahlGeräte; i++) System.out.println(inventarListe[i]);
        }
        System.out.println();
        System.out.println();
    }

    // Ausgabe der offenen Posten und deren Preis
    private static void ausgabeOffenePosten() {
        double summe = 0.0;
        System.out.println("Noch nicht bezahlte Geräte:");
        System.out.println("---------------------------");

        for (int i=0; i < anzahlGeräte; i++) {
            if ( ! inventarListe[i].isBezahltStatus()){
                System.out.println(inventarListe[i]);
                summe += inventarListe[i].getPreis();
            }
        }
        System.out.println();
        if (summe > 0) System.out.println("Noch zu begleichender Betrag der offenen Posten: "+ nf.format(summe));
        else System.out.println("Keine offenen Posten");
    }

    // Ausgabe der gesamten Liste, sortiert nach Preis
    private static void ausgabeInventarListeSortiertNachPreis() {
        System.out.println("gesamte Inventarliste, sortiert nach preis");
        System.out.println("------------------------------------------");
        if (anzahlGeräte == 0){
            System.out.println("keine Geräte vorhanden");

        }else {
            Gerät[] sortierteInventarListe = sortiereListe();
            for (int i=0; i < anzahlGeräte; i++) {
                System.out.println(sortierteInventarListe[i]);
            }

        }
        System.out.println("------------------------------------------");
        System.out.println();
        System.out.println();
    }

    private static Gerät[] sortiereListe() {

        Gerät[] sortierteListe = new Gerät[inventarListe.length];
        for (int i = 0; i < anzahlGeräte; i++) {
            Gerät aktuellesGerät = inventarListe[i];

            // das aktuelle Gerät soll jetzt in eine sortierte Liste eingefügt werden:
            int j = i;
            while (j > 0 && sortierteListe[j -1].getPreis() > aktuellesGerät.getPreis()) {
                sortierteListe[j] = sortierteListe[j-1];
                j--;
            }
            sortierteListe[j] = aktuellesGerät;
        }
        return sortierteListe;
    }

    public static void main(String[] args) {
        ausgabeInventarListe();

        gerätHinzufügen( new Gerät(1, "Dell Monitor", "Monitor", 150.00 , 2013 , true));
        gerätHinzufügen( new Gerät(2, "HP Farblaserdrucker 123", "Drucker", 245.95, 2011, true));
        gerätHinzufügen( new Gerät(3, "Microsoft Ergonomic Tastatur", "Tastatur", 99.99, 2015, true ));
        gerätHinzufügen( new Gerät(4, "LP Monitor 17 Zoll", "Monitor", 139.12, 2014, true));
        gerätHinzufügen( new Gerät(5, "Brother Printer","Drucker", 180.95, 2008, false ));
        gerätHinzufügen( new Gerät(6, "Dell Latidude 3350","Laptop", 1599.99, 2017, false ));
        gerätHinzufügen( new Gerät(7, "Optic Mouse", "Maus", 25.22, 2016, true));
        gerätHinzufügen( new Gerät(8, "Wireless Keyboard", "Keyboard", 119.99, 2017, false));

        ausgabeInventarListe();

        ausgabeOffenePosten();
        ausgabeInventarListeSortiertNachPreis();
    }
}
