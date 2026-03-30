package ro.ase.cts.clase;

public class Tren extends TransportSubteran {
    public Tren(String nume, int numarLocuri, int adancime, int numarStatii) {
        super(nume, numarLocuri, adancime, numarStatii);
    }

    @Override
    public void afisareDescriere() {
        System.out.println("Tren: " + super.toString());
    }
}
