public class Währungsrechner {


    private double wechselkurs;
    private String fremdwährung;

    public Währungsrechner(double wechselkurs) {
        this(wechselkurs, "?");
        // this.wechselkurs = wechselkurs;
        // this.fremdwährung = fremdwährung;

    }

    public Währungsrechner(double wechselkurs, String fremdwährung) {
        this.fremdwährung = fremdwährung;
        this.wechselkurs = wechselkurs;
    }

    public void setWechselkurs(double wechselkurs) {
        this.wechselkurs = wechselkurs;
    }

    public String getFremdwährung() {
        return fremdwährung;
    }

    public double inEuro (double fremdBetrag){
        return fremdBetrag * wechselkurs;
    }

    public double inFremd (double euroBetrag){
        return euroBetrag / wechselkurs;
    }

}
