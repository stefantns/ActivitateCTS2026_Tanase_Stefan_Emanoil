package ro.ase.cts.clase;

public class Ebook extends PublicatieDigitala{
    public Ebook(String nume, String autor, double dimensiune) {
        super(nume, autor, dimensiune);
    }

    @Override
    public void afisareDescriere() {
        System.out.println("Ebook: " + super.toString());
    }
}
