package ro.ase.cts.clase;

public class Burger extends FelDeMancare{
    public Burger(String nume, double pret) {
        super(nume, pret);
    }

    @Override
    public void afiseazaDetalii() {
        System.out.println("Burger: " + super.toString());
    }
}
