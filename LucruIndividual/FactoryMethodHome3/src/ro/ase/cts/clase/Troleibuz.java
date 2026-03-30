package ro.ase.cts.clase;

public class Troleibuz extends TransportTerestru{
    public Troleibuz(String nume, int numarLocuri, int numarStatii) {
        super(nume, numarLocuri, numarStatii);
    }

    @Override
    public void afisareDescriere() {
        System.out.println("Tramvai: "+ super.toString());
    }
}
