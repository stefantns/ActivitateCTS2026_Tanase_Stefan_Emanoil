package ro.ase.cts.model;

public class Autobuz implements MijlocTransport{
    private String nume;
    private int numarLocuri;
    private double pretBilet;

    public Autobuz(String nume, int numarLocuri, double pret) {
        this.nume = nume;
        this.numarLocuri = numarLocuri;
        this.pretBilet = pret;
    }

    @Override
    public String getNume() {
        return nume;
    }

    @Override
    public int getNumarLocuri() {
        return numarLocuri;
    }

    @Override
    public double getPretBilet() {
        return pretBilet;
    }

    @Override
    public void porneste() {
        System.out.println("Autobuzul a pornit pe traseu.");
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Autobuz{");
        sb.append("nume='").append(nume).append('\'');
        sb.append(", numarLocuri=").append(numarLocuri);
        sb.append(", pret=").append(pretBilet);
        sb.append('}');
        return sb.toString();
    }

}
