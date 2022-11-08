public class Einwohner {

    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    private int einkommen;

    public Einwohner(String name, int einkommen) {
        this.name = name;
        this.einkommen = einkommen;
    }

    public int zuVersteuern() {
        return einkommen;
    }

    public int steuer() {
        int steuer = this.zuVersteuern() * 10 / 100;
        if (steuer < 1) steuer = 1;
        return steuer;
    }
}
