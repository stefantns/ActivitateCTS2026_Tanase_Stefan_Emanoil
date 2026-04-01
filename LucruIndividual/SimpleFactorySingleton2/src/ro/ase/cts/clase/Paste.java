package ro.ase.cts.clase;

public class Paste extends FelDeMancare{
    public Paste(String nume, double pret) {
        super(nume, pret);
    }

    @Override
    public void afiseazaDetalii() {
        System.out.println("Paste: " + super.toString());
    }
}
