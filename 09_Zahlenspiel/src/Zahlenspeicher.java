public class Zahlenspeicher /* exends Object */ {
    // Welche Attribute brauchen wir?
    private int[] speicher;
    private int anzahl; // aka index, position
    // Notwendiger Konstruktor

    public Zahlenspeicher(int startKapazität) {
        this.speicher = new int[ startKapazität ];
        this.anzahl = 0;
    }
    // Notwendige Methoden
    public void hinzufügen(int zahl) {
        if (anzahl >= speicher.length)  // array ist voll, können keine weiteren Daten hinzufügen
            return;                     // erste Lösung, Abbruch des Hinzufügens
        speicher[ anzahl ] = zahl;
        anzahl++;
    }
    public void löscheLetzteZahl() {
        if (anzahl > 0)
            anzahl--;
    }

    public int suchen(int zahl){
        for (int i=0; i<anzahl; i++){
            if (speicher[i] == zahl)
                return i;
        }
        return -1;
    }

    public boolean finden(int zahl) {
        return suchen(zahl) >= 0;
    }

    public void lösche(int zahl) {
        int position = suchen(zahl);
        if (position >= 0);
        for (int i = position; i<anzahl-1; i++) {
            speicher[i] = speicher [i+1];
        }
        löscheLetzteZahl();
    }

    @Override
    public String toString() {
        String ausgabe = "[";
        for (int i=0; i<anzahl; i++) {
            if (i > 0) ausgabe += ", ";
            ausgabe += speicher[i];
        }
        ausgabe += "]"; // Faulenzer: ausgabe = ausgabe + "]"
        return ausgabe;
    }
}