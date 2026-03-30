package ro.ase.cts.clase;

public abstract class TransportSubteran implements MijlocTransport{
    private String nume;
    private int numarLocuri;
    private int adancime;
    private int numarStatii;

    public TransportSubteran(String nume, int numarLocuri, int adancime, int numarStatii) {
        this.nume = nume;
        this.numarLocuri = numarLocuri;
        this.adancime = adancime;
        this.numarStatii = numarStatii;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("nume='").append(nume).append('\'');
        sb.append(", numarLocuri='").append(numarLocuri).append('\'');
        sb.append(", adancime=").append(adancime);
        sb.append(", numarStatii=").append(numarStatii);
        return sb.toString();
    }
}
