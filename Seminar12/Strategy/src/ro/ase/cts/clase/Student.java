package ro.ase.cts.clase;

public class Student {
    private ModSustinere modSustinere;
    private String nume;

    public Student(String nume) {
        this.modSustinere = new Grila();
        this.nume = nume;
    }

    public Student(ModSustinere modSustinere, String nume) {
        this.modSustinere = modSustinere;
        this.nume = nume;
    }

    public void setModSustinere(ModSustinere modSustinere) {
        this.modSustinere = modSustinere;
    }

    public void examinare() {
        this.modSustinere.sustinereExamen();
    }
}
