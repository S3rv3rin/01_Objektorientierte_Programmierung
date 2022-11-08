public class Hauptprogramm {

    public static void main(String[] args) {
        int studentenNummer = 1;
        System.out.println("Ich erstelle jetzt einen Studenten");
        Student s1 = new Student(studentenNummer , "Mueller", "Helmut", "Java", 2 );
        studentenNummer++;
        System.out.println("Ich erstelle jetzt einen zweiten Student");
        Student s2 = new Student(studentenNummer , "Max", "Musterfrau");


        System.out.println("Jetzt kommt die Ausgabe:");
        System.out.println("Student " + s1.getStudentenNummer() +" : " + s1.getStudienfach() );
        System.out.println("Student " + s2.getStudentenNummer() +" : " + s2.getName() );
    }

}
