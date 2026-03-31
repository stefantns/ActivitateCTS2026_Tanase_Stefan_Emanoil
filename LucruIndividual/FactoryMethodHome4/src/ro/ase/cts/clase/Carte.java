package ro.ase.cts.clase;

public class Carte extends PublicatieFizica{
    public Carte(String nume, String autor, int numarPagini) {
        super(nume, autor, numarPagini);
    }

    @Override
    public void afisareDescriere() {
        System.out.println("Carte: " + super.toString());
    }
}
