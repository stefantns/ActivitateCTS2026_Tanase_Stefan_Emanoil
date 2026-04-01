package ro.ase.cts.clase;

public class Steak extends FelDeMancare{
    public Steak(String nume, double pret) {
        super(nume, pret);
    }

    @Override
    public void afiseazaDetalii() {
        System.out.println("Steak: " + super.toString());
    }
}
