package ro.ase.cts.clase;

public class Revista extends PublicatieFizica{

    public Revista(String nume, String autor, int numarPagini) {
        super(nume, autor, numarPagini);
    }

    @Override
    public void afisareDescriere() {
        System.out.println("Revista: " + super.toString() );
    }
}
