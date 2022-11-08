public abstract class Spieler {
    //protected Spielbrett spielbrett; -- nur für mich und alle Unterklassen (theoretisch)
    private Spielbrett spielbrett;  // leider lässt uns Java keine anderen Möglichkeit
    private String name;

    public Spieler(Spielbrett spielbrett, String name) {
        this.spielbrett = spielbrett;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Spielbrett getSpielbrett() {
        return spielbrett;
    }

    public abstract int macheZug();
}
