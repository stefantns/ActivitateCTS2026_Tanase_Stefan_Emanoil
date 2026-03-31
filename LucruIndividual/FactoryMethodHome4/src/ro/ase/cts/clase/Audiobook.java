package ro.ase.cts.clase;

public class Audiobook extends PublicatieDigitala{
    public Audiobook(String nume, String autor, double dimensiune) {
        super(nume, autor, dimensiune);
    }

    @Override
    public void afisareDescriere() {
        System.out.println("Audiobook: " + super.toString());
    }
}
