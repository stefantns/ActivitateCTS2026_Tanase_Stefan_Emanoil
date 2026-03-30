package ro.ase.cts.model;

public class Orhidee implements Floare{
    private String nume;
    private String culoare;
    private double pret;

    public Orhidee(String nume, String culoare, double pret) {
        this.nume = nume;
        this.culoare = culoare;
        this.pret = pret;
    }

    @Override
    public String getNume() {
        return nume;
    }

    @Override
    public String getCuloare() {
        return culoare;
    }

    @Override
    public double getPret() {
        return pret;
    }

    @Override
    public void impacheteaza() {
        System.out.println("Orhideea este in proces de impachetare");
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Orhidee{");
        sb.append("nume='").append(nume).append('\'');
        sb.append(", culoare='").append(culoare).append('\'');
        sb.append(", pret=").append(pret);
        sb.append('}');
        return sb.toString();
    }
}
