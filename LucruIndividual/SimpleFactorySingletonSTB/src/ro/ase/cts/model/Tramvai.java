package ro.ase.cts.model;

public class Tramvai implements MijlocTransport{
    private String nume;
    private int numarLocuri;
    private double pretBilet;

    public Tramvai(String nume, int numarLocuri, double pretBilet) {
        this.nume = nume;
        this.numarLocuri = numarLocuri;
        this.pretBilet = pretBilet;
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
        System.out.println("Tramvaiul a pornit pe traseu.");
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Tramvai{");
        sb.append("nume='").append(nume).append('\'');
        sb.append(", numarLocuri=").append(numarLocuri);
        sb.append(", pretBilet=").append(pretBilet);
        sb.append('}');
        return sb.toString();
    }
}
