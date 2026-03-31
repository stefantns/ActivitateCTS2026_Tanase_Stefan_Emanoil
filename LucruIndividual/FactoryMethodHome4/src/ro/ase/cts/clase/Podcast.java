package ro.ase.cts.clase;

public class Podcast extends PublicatieDigitala{
    public Podcast(String nume, String autor, double dimensiune) {
        super(nume, autor, dimensiune);
    }

    @Override
    public void afisareDescriere() {
        System.out.println("Podcast: " + super.toString());
    }
}
