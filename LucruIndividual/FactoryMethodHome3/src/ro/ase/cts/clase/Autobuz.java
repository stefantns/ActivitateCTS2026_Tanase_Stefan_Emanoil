package ro.ase.cts.clase;

public class Autobuz extends TransportTerestru{
    public Autobuz(String nume, int numarLocuri, int numarStatii) {
        super(nume, numarLocuri, numarStatii);
    }

    @Override
    public void afisareDescriere() {
        System.out.println("Autobuz: " + super.toString());
    }
}
