package ro.ase.cts.clase;

public class Secretar extends PersonalNonMedical{
    public Secretar(String nume, int varsta) {
        super(nume, varsta);
    }

    @Override
    public void afisareDescriere() {
        System.out.println("Secretar: " + super.toString());
    }
}
