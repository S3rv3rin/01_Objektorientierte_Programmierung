class Person {
    private int instanzCount;
    private static int count; // Klassenvariable
    private String name;      // Instanzvariable
    Person(String name) {
        this.name = name;
        count++;
        instanzCount++;
    }
    public int getInstanzcounter(){
        return instanzCount;
    }
    public String getName() {
        return name;
    }
    public int getCount() {
        return count;
    }
}