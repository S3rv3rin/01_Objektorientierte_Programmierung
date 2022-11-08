import java.util.Locale;
import java.util.Scanner;

public class Königreich {

    public static void main(String[] args) {
        Scanner eingabe = new Scanner(System.in);

        while (true){
            System.out.println("Bevölkerungsgruppe (K, A, B, L): ");
            char gruppe = eingabe.next().toUpperCase().charAt(0);
            // sanity check:
            // if (!(gruppe == 'K' || gruppe == 'A' || gruppe == 'B' || gruppe == 'L'))
            //    break;
            if (gruppe != 'K' && gruppe != 'A' && gruppe != 'B' && gruppe != 'L') break;
            System.out.print("Name des Einwohners: ");
            String name = eingabe.next();

            System.out.print("Einkommen des Einwohners: ");
            int einkommen = eingabe.nextInt();

            Einwohner einwohner;
            if (gruppe == 'K') einwohner = new König(name, einkommen);
            else if (gruppe == 'A') einwohner = new Adel(name, einkommen);
            else if (gruppe == 'B') einwohner = new Bauer(name, einkommen);
            else einwohner = new Leibeigener(name, einkommen);


            System.out.println( "Der Einwohner'" + name + "' versteuert " +
                    einwohner.zuVersteuern() + " Taler und zahlt " +
                    einwohner.steuer() + " Taler Steuern.");

            // TODO - Benutzt erstmal Eiwohner, später die o.g. Gruppe





        }
    }



}
