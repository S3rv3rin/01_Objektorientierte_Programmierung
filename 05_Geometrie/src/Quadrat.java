public class Quadrat extends Grundform{
    private double seitenlänge;

    public Quadrat(double seitenlänge) {
        this.seitenlänge = seitenlänge;
    }

    public double berechneFläche() {
        return seitenlänge * seitenlänge;
    }

    public double berechneUmfang() {
        return seitenlänge * 4;
    }
}
