public class Student {


    public void setStudentenNummer(int studentenNummer) {
        this.studentenNummer = studentenNummer;
    }

    // Attribute
    private int studentenNummer;
    private String name;
    private String vorname;
    private String studienfach;
    private int semester;


    public Student (int studentenNummer, String name, String vorname, String studienFach, int semester){
        this.studentenNummer = studentenNummer;
        this.name = name;
        this.vorname = vorname;
        this.studienfach = studienFach;
        this.semester = semester;

    }

    public Student (int studentenNummer, String name, String vorname){
        this (studentenNummer, name, vorname, "n.n.", 0);
    }
    public void pruefen (){

    }
    public boolean krankenstand(){
        return false;
    }


    public int getStudentenNummer() {
        return studentenNummer;
    }

    public String getStudienfach() {
        return studienfach;
    }

    public String getName() {
        return name;
    }
    public String getVorName() {
        return name;
    }
    public int getSemester() {
        return semester;
    }

}




