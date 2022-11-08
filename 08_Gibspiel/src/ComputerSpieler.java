public class ComputerSpieler extends Spieler {
    private static int computerNummer = 0;
    private boolean spielstärke;

    public ComputerSpieler(Spielbrett spielbrett, boolean spielstärke) {
        super(spielbrett, "Computer " + getNächsteComputerNummer());
        this.spielstärke = spielstärke;
    }
    private static int getNächsteComputerNummer() {
        computerNummer++;
        return computerNummer;
    }
    private int zielEiner(int zielZahl) {
        int wasFehltZurNächstenZielZahl = zielZahl - (getSpielbrett().getAnzahl() % 10);
        if (wasFehltZurNächstenZielZahl == 0) return 10;
        else if (wasFehltZurNächstenZielZahl < 0) return wasFehltZurNächstenZielZahl += 10;
        else return wasFehltZurNächstenZielZahl;
    }
    @Override
    public int macheZug() {
        int aktuelleAnzahl = getSpielbrett().getAnzahl();
        int wasFehltNochZumGewinn = 100 - aktuelleAnzahl;

        if (spielstärke) {
             if (aktuelleAnzahl < 89){
                 int einer = aktuelleAnzahl % 10;
                 int zehner = aktuelleAnzahl / 10;
                 if (einer <= zehner) return zielEiner(zehner + 1);
                 else return zielEiner(zehner + 2);
             }
             else if (aktuelleAnzahl == 89) return 1;
             else return wasFehltNochZumGewinn;
        }else {
            // komplexe strategische Überlegungen
            if (wasFehltNochZumGewinn <= 10) return wasFehltNochZumGewinn;
            // einfache, recht einfallslose KI
            else return (int) (Math.random() * 10) + 1;
        }
    }
}

