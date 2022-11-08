import java.text.DecimalFormat;
import java.util.Scanner;

public class WährungsrechnerTest {
    public static void  ausgabeBetrag(double betrag, String währung){
        DecimalFormat df = new DecimalFormat("#,##0.000");
        //  muss in US-Format angegeben werden. Die Ausgabe erfolgt nach Systemeinstellungen
        System.out.println(df.format(betrag) + " " + währung );

    }

    public static void main(String[] args) {

        Scanner eingabe = new Scanner(System.in);
        while (true){
            System.out.print("Bitte Fremdwährung eingeben: ");
            String fremdwährung = eingabe.next();
            System.out.print("Bitte Wechselkurs eingeben: ");
            double wechselkurs = Double.parseDouble(eingabe.next());
            Währungsrechner kurs = new Währungsrechner(wechselkurs, fremdwährung);

            System.out.print("Bitte Betrag eingeben: ");
            double betrag = eingabe.nextDouble();

            System.out.println("Bitte Zielwährung wählen:  ");
            System.out.print("1 = Fremdwährung; ");
            System.out.print("2 = Euro; ");
            System.out.println("0 = Programm beenden ");
            int zielwährung = eingabe.nextInt();

            if (zielwährung == 0) break;

            else if(zielwährung == 1){
                System.out.print(betrag + " Euro entsprechen ");
                ausgabeBetrag(kurs.inEuro(betrag) , kurs.getFremdwährung());
            }
            else if(zielwährung == 2){
                System.out.print(betrag + kurs.getFremdwährung() + " entsprechen ");
                ausgabeBetrag(kurs.inFremd(betrag), "Euro");
            }
            /*
            System.out.println(betrag + " in Euro entsprechen:");
            // System.out.println(dollarWR.inFremd(betrag) + " Dollar");
            ausgabeBetrag(kurs.inFremd(betrag), "Dollar");

            System.out.println(betrag + " in Dollar etsprechen:");
            // System.out.println(dollarWR.inEuro(betrag) + " Euro");
            ausgabeBetrag(kurs.inEuro(betrag) , "Euro");
            */



        }
    }

}
