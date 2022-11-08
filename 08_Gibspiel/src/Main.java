import java.util.Scanner;

public class Main {

    /*
     * Gibspiel:
     * Jeder Spieler kann 1-10 Elemente auf einem Spielbrett
     * plazieren. Welcher Spieler das 100. Element hinlegt,
     * hat gewonnen.
     * Das Spiel beginnt mit einer zufälligen Anzahl von
     * Elementen, die bereits auf dem Spielbrett liegen.
     */

    /*
     * Welche Klassen brauchen wir?
     * - Spieler (Name, Spielbrett)
     * -- MenschSpieler
     * -- ComputerSpieler
     * - Spielbrett (Anzahl Elemente)
     */

    public static void main(String[] args) {
        Spielbrett spielbrett = new Spielbrett();
        Spieler[] spieler = new Spieler[2]; // leeres Array mit 2 Elementen
        int[] scoreBoard = new int[2];
        String name;
        boolean spielstärke;
        int anzahlRunden = 1;

        Scanner eingabe = new Scanner(System.in);
        System.out.println("Gibspiel v1.0");
        System.out.print("Anzahl menschliche Spieler (0-2): ");
        int anzahlSpieler = eingabe.nextInt();

        if (anzahlSpieler < 2) {
            System.out.print("Spielstärke Computer 1 ? ");
            spielstärke = eingabe.nextBoolean();
            spieler[0] = new ComputerSpieler(spielbrett, spielstärke);
        }
        else {
            System.out.print("Name von Spieler 1: ");
            name = eingabe.next();
            spieler[0] = new MenschSpieler(spielbrett, name);
        }
        if (anzahlSpieler < 1) {
            System.out.print("Spielstärke Computer 2 ? ");
            spielstärke = eingabe.nextBoolean();
            spieler[1] = new ComputerSpieler(spielbrett, spielstärke);
        }
        else {
            System.out.print("Name von Spieler 2: ");
            name = eingabe.next();
            spieler[1] = new MenschSpieler(spielbrett, name);
        }

        if (anzahlSpieler == 0) {
            System.out.print("Wie viele Spiele? ");
            anzahlRunden = eingabe.nextInt();
        }

        while (anzahlRunden-- > 0) {
            int aktuellerSpieler = 0;
            spielbrett.setup();
            int counter = 3;
            while (true) {
                System.out.println("Anzahl Elemente: " + spielbrett.getAnzahl());
                System.out.println();
                int anzahlElemente = spieler[aktuellerSpieler].macheZug();
                if (spielbrett.führeZugAus(anzahlElemente)) { // gültiger Zug?
                    System.out.println("Spieler " +
                            spieler[aktuellerSpieler].getName() +
                            " spielt " + anzahlElemente);

                    if (spielbrett.hatGewonnen()) {
                        System.out.println("Spieler " +
                                spieler[aktuellerSpieler].getName() +
                                " hat gewonnen!");
                        scoreBoard[aktuellerSpieler]++;
                        break;
                    }
                    // Nächster Spieler:
                    // wechselt immer zwischen 0 und 1
                    aktuellerSpieler = 1 - aktuellerSpieler;
                    //aktuellerSpieler = (aktuellerSpieler + 1) % 2;
                    //aktuellerSpieler++;
                    //if (aktuellerSpieler == 2) aktuellerSpieler = 0;
                } else {
                    System.out.println("Ungültiger Zug! Nochmal wählen ...");
                    counter --;
                }
                if (counter == 0) System.exit(0);
            }
        }
        System.out.println("Spieler 1 : " + scoreBoard[0]);
        System.out.println("Spieler 2 : " + scoreBoard[1]);
    }
}
