package ro.ase.cts.clase;

public abstract class PersonalAbstract implements PersonalSpital{
    private String nume;
    private int varsta;
    private double salariu;

    public PersonalAbstract(String nume, int varsta, double salariu) {
        this.nume = nume;
        this.varsta = varsta;
        this.salariu = salariu;
    }

    @Override
    public String getNume() {
        return this.nume;
    }

    @Override
    public int getVarsta() {
        return this.varsta;
    }

    @Override
    public double getSalariu() {
        return this.salariu;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("nume='").append(nume).append('\'');
        sb.append(", varsta=").append(varsta);
        sb.append(", salariu=").append(salariu);
        return sb.toString();
    }
}
