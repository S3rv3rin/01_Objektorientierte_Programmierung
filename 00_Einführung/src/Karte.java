public class Karte {

    // Attribute
    public int wert;
    public String farbe;

    // CCTOR (Preconstructor)
    public String format = "standard";
    // ...

    // Hilfsmethode hier in der Klasse für die Initialisierung der Attribute
    public void init(int neuerWert, String neueFarbe, String neuesFormat) {
        wert = neuerWert;
        farbe = neueFarbe;
        format = neuesFormat;
    }

    // Spezialmethode: Konstruktor (CTOR)
    // Anforderungen an den Konstruktor
    // - Name muss mit der Klasse übereinstimmen
    // - hat KEINEN Rückgabetyp (nichtmal void)
    public /* KEIN RÜCKGABETYP */ Karte(int neuerWert, String neueFarbe) {
        // mal zum Testen
        //System.out.println("Format = " + format);
//        System.out.println("Das ist der 2er Konstruktor");

        // 99% der Aufgaben eines CTOR sind
        // -> Initialisierung der Attribute !!
//        wert = neuerWert;
//        farbe = neueFarbe;
        //init(neuerWert, neueFarbe, "standard");
        // ! oder den 3er CTOR aufrufen
        this(neuerWert, neueFarbe, "standard");
    }


    // für die ungeschickten Anwender (Vertauschung der Parameter)
    public Karte(String neueFarbe, int neuerWert) {
        // der 2er Konstruktor gibt seine Parameter an den 3er Konstruktor weiter
        // Schlüsselwort zum Aufruf eines anderen Konstruktors: this(...)
        // Regeln für this:
        // - muss erste Anweisung im Konstruktor sein
        // - kann nur einmal benutzt werden
        // - kann nicht mit anderen CTOR-Aufrufen kombiniert werden (später)

//        System.out.println("Das ist der alternative 2er Konstruktor");
//        wert = neuerWert;
//        farbe = neueFarbe;
        // ACHTUNG: doppelter Programmcode (DRY - Don't Repeat Yourself)
        this(neuerWert, neueFarbe, "standard");
    }


    // noch ein Konstruktor (Prinzip der Überladung)
    public Karte(int neuerWert, String neueFarbe, String neuesFormat) {
//        System.out.println("Das ist der 3er Konstruktor");
        wert = neuerWert;
        farbe = neueFarbe;
        format = neuesFormat;
    }


    // Methoden (Operationen)
    public void ziehen() {
        System.out.println(farbe + wert + " wurde gezogen");
    }

    public void ausspielen() {
        System.out.println("Spiele die Karte " + farbe + wert);
    }
}
