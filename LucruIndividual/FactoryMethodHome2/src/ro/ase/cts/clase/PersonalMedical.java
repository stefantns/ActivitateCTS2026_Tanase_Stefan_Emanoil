package ro.ase.cts.clase;

public abstract class PersonalMedical implements  PersonalSpital{
    private String nume;
    private int varsta;
    private boolean medical = true;

    public PersonalMedical(String nume, int varsta, boolean medical) {
        this.nume = nume;
        this.varsta = varsta;
        this.medical = medical;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("nume='").append(nume).append('\'');
        sb.append(", varsta=").append(varsta);
        sb.append(", medical=").append(medical);
        return sb.toString();
    }
}
