public class Adel extends Einwohner{

    public Adel(String name, int einkommen) {
        super(name, einkommen);
    }
    public int steuer (){
        int steuer = super.steuer();
        if (steuer < 20) steuer = 20;
        return steuer;
    }
}
