public class Bruch {

    // Das Objekt ist immutable,
    // d.h. kann nach Erzeugung nicht mehr verändert werden
    // (realisiert durch das Schlüsselwort: final)
    private final long zähler;
    private final long nenner;
    private long ggT(long a, long b) {
        if (a == 0) return b;
        if (b == 0) return a;
        if (a < 0) a = -a;
        if (b < 0) b = -b;
        while (a != b) {
            if (a > b) a -= b;  // a = a - b
            else b -= a;
        }
        return a;
    }
    public Bruch() {
        this(1, 1);
    }
    public Bruch(int zahl) {
        this(zahl, 1);
    }
    // Todo Hausaufgabe:
    public Bruch(double zahl) {
        long teiler = 1;
        while (zahl-(long) zahl != 0) {
            zahl *= 10;
            teiler *=  10;
        }
        long ggT = ggT((long) zahl,teiler);
        this.zähler = (long) zahl /ggT;
        this.nenner = teiler / ggT;
    }

    public Bruch(long zähler, long nenner) {
        if (zähler < 0 && nenner < 0) {
            zähler = -zähler;
            nenner = -nenner;
        }
        this.zähler = zähler;
        this.nenner = nenner;

    }

    public Bruch add(Bruch that) {
        long neuerNenner = this.nenner * that.nenner;
        long neuerZähler = this.zähler * that.nenner
                + that.zähler * this.nenner;
        return new Bruch(neuerZähler, neuerNenner).kürzen();
    }

    public Bruch sub(Bruch that) {
        return add( that.negieren() );
    }

    public Bruch mult(Bruch that) {
        return new Bruch( this.zähler * that.zähler,
                this.nenner * that.nenner ).kürzen();
    }

    public Bruch div(Bruch that) {
        return mult( that.kehrwert() ).kürzen();
    }

    public Bruch potenz(int exponent) {
        Bruch ergebnis = new Bruch(1, 1);
        Bruch term = new Bruch(zähler, nenner);
        if (exponent < 0) {
            term = this.kehrwert();
            exponent = -exponent;
        }

        for (int i=0; i < exponent; i++) {
            ergebnis = ergebnis.mult(term);
        }
        return ergebnis.kürzen();
    }

    public Bruch kehrwert() {
        return new Bruch(nenner, zähler);
    }

    public Bruch negieren() {
        return new Bruch( -zähler, nenner );
    }

    public Bruch kürzen() {
        long teiler = ggT(zähler, nenner);
        return new Bruch(zähler / teiler, nenner / teiler);
    }

    // Todo Hausaufgabe:
    public double toDouble() {
        return ( (double) zähler / (double) nenner);
    }
    public String toString() {
        return zähler + "/" + nenner;
    }

    public boolean isEqual(Bruch b) {
//        Bruch a1 = this.kürzen();
//        Bruch b1 = b.kürzen();
//        return (a1.zähler == b1.zähler
//                && a1.nenner == b1.nenner);
        Bruch test = this.div(b);
        return (test.zähler == test.nenner);
    }
}