package ro.ase.cts.clase;

public class Brancardier extends PersonalAbstract{
    public Brancardier(String nume, int varsta, double salariu) {
        super(nume, varsta, salariu);
    }

    @Override
    public void afisareDescriere() {
        System.out.println("Brancardier: " + super.toString());
    }
}
