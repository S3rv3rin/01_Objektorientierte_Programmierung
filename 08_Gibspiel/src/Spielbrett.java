public class Spielbrett { // Mockup - Klasse/Objekt/Modul/Funktion ohne Inhalt
    private int anzahl;

    public void setup() {
        // irgend eine zufällige Zahl zwischen 1 und 30
        anzahl = (int)(Math.random() * 30) + 1;
    }

    public boolean führeZugAus(int anzahlElemente) {
        // prüfen, ob der Zug durchgeführt werden kann
        if (anzahlElemente < 1) return false;
        if (anzahlElemente > 10) return false;
        if (anzahl + anzahlElemente > 100) return false;

        // Zug wird jetzt durchgeführt
        anzahl += anzahlElemente;
        return true;
    }

    public boolean hatGewonnen() {
        return (anzahl == 100);
    }

    public int getAnzahl() {
        return anzahl;
    }
}
