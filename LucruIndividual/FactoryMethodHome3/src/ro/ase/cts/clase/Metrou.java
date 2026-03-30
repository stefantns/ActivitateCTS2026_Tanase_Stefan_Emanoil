package ro.ase.cts.clase;

public class Metrou extends TransportSubteran{
    public Metrou(String nume, int numarLocuri, int adancime, int numarStatii) {
        super(nume, numarLocuri, adancime, numarStatii);
    }

    @Override
    public void afisareDescriere() {
        System.out.println("Metrou: " + super.toString());
    }
}
