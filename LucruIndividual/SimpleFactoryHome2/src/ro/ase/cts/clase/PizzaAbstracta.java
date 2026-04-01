package ro.ase.cts.clase;

public abstract class PizzaAbstracta implements IPizza{
    private String nume;
    private double pret;

    public PizzaAbstracta(String nume, double pret) {
        this.nume = nume;
        this.pret = pret;
    }

    @Override
    public String getNume() {
        return nume;
    }

    @Override
    public double getPret() {
        return pret;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("nume='").append(nume).append('\'');
        sb.append(", pret=").append(pret);
        return sb.toString();
    }
}
