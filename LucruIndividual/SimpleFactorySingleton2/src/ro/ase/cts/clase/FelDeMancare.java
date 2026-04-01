package ro.ase.cts.clase;

public abstract class FelDeMancare implements FelPrincipal{
    private String nume;
    private double pret;

    public FelDeMancare(String nume, double pret) {
        this.nume = nume;
        this.pret = pret;
    }

    @Override
    public String getNume() {
        return this.nume;
    }

    @Override
    public double getPret() {
        return this.pret;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("nume='").append(nume).append('\'');
        sb.append(", pret=").append(pret);
        return sb.toString();
    }
}
