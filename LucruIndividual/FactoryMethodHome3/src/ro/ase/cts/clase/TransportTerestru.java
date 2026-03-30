package ro.ase.cts.clase;

public abstract class TransportTerestru implements MijlocTransport{
    private String nume;
    private int numarLocuri;
    private int numarStatii;

    public TransportTerestru(String nume, int numarLocuri, int numarStatii) {
        this.nume = nume;
        this.numarLocuri = numarLocuri;
        this.numarStatii = numarStatii;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("nume='").append(nume).append('\'');
        sb.append(", numarLocuri=").append(numarLocuri);
        sb.append(", numarStatii=").append(numarStatii);
        return sb.toString();
    }
}
