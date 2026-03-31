package ro.ase.cts.clase;

public class Ziar extends PublicatieFizica{
    public Ziar(String nume, String autor, int numarPagini) {
        super(nume, autor, numarPagini);
    }

    @Override
    public void afisareDescriere() {
        System.out.println("Ziar: " + super.toString() );
    }
}
