import java.util.Scanner;

public class MenschSpieler extends Spieler {

    public MenschSpieler(Spielbrett spielbrett, String name) {
        super(spielbrett, name);
    }

    @Override
    public int macheZug() {
        Scanner eingabe = new Scanner(System.in);
        System.out.println("Am Zug: Spieler " + this.getName());
        System.out.print("Ihre Wahl (1-10): ");
        return eingabe.nextInt();
    }
}
