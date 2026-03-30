package ro.ase.cts.clase;

public abstract class PersonalNonMedical implements  PersonalSpital{
    private String nume;
    private int varsta;


    public PersonalNonMedical(String nume, int varsta) {
        this.nume = nume;
        this.varsta = varsta;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("nume='").append(nume).append('\'');
        sb.append(", varsta=").append(varsta);
        return sb.toString();
    }
}
