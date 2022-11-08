import java.util.Locale;
import java.util.Scanner;

public class Bruchrechnen {

    public static void main(String[] args) {
        Bruch b1 = new Bruch(1, 2);
        Bruch b2 = new Bruch(6, 8);
        Bruch b3 = new Bruch(4, 2);
        Bruch d1 = new Bruch(0.625);


        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
        System.out.println( b1.add(b2) ); // b1 + b2
        System.out.println( b1.sub(b2) );
        System.out.println( b1.mult(b2) );
        System.out.println( b1.div(b2) );

        b3 = b3.kehrwert();
        System.out.println(b3);


        if (b1.isEqual(b3)) {
            System.out.println("b1 ist b3");
        }
        else {
            System.out.println("b1 nicht b3");
        }

        System.out.println( b1.potenz(4));
        System.out.println(b1.toDouble());
        System.out.println(d1);
    }
}


