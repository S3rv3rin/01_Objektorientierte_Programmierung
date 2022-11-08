public class Main {

    public static void main(String[] args) {

        Kreis kreis = new Kreis (4.2);
        Quadrat quadrat = new Quadrat (9.7);

        System.out.println(kreis.berechneUmfang());
        System.out.println(kreis.berechneFläche());
        System.out.println(quadrat.berechneFläche());
        System.out.println(quadrat.berechneUmfang());
    }


}
