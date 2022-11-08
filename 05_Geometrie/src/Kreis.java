public class Kreis extends Grundform{
    private double radius;

    public Kreis(double radius) {
        this.radius = radius;
    }

    public double berechneFläche() {
        return Math.PI * radius * radius;
    }

    @Override
    public double berechneUmfang() {
        return 2 * Math.PI * radius;
    }
}
