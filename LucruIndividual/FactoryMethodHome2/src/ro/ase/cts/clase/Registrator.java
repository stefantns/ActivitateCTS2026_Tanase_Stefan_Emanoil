package ro.ase.cts.clase;

public class Registrator extends PersonalNonMedical{
    public Registrator(String nume, int varsta) {
        super(nume, varsta);
    }

    @Override
    public void afisareDescriere() {
        System.out.println("Registrator: " + super.toString());
    }
}
