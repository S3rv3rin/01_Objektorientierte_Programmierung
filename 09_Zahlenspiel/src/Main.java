public class Main {
    public static void main(String[] args) {
        Zahlenspeicher z = new Zahlenspeicher(10);   // Startgröße unseres Zahlenspeichers
        z.hinzufügen(17);
        z.hinzufügen(4);
        z.hinzufügen(32);
        z.hinzufügen(12);
        z.hinzufügen(18);
        System.out.println( z );
        //z.löscheLetzteZahl();
        //z.lösche1(4);
       // System.out.println( z );

        int i =1 ;
        while ( i < 10 ) {
            i++;
            break;
        }


        int [] a = new int[5];

        a[0] = 3;
        a[1] = 5;

        System.out.println(a[0]+"  " + a[1]);

       // z.lösche2(12);  // lösche die 12 aus dem Zahlenspeicher
        System.out.println( z );
        int zuSuchendeZahl = 18;
        if ( z.finden(zuSuchendeZahl) ) {
            System.out.println("Die " + zuSuchendeZahl + " ist im Zahlenspeicher enthalten");
        }
        else {
            System.out.println("Die " + zuSuchendeZahl + " wurde nicht gefunden :(");
        }
    }
}