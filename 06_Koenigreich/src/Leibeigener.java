public class Leibeigener extends Bauer{

    public Leibeigener(String name, int einkommen) {
        super(name, einkommen);
    }

    public int zuVersteuern() {
        int steuer = super.zuVersteuern();
        steuer -= 12;
        if (steuer < 0) steuer = 0;
        return steuer;
    }
}
