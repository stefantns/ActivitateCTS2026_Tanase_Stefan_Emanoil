package ro.ase.cts.clase;

public class Asistent extends PersonalAbstract{
    public Asistent(String nume, int varsta, double salariu) {
        super(nume, varsta, salariu);
    }

    @Override
    public void afisareDescriere() {
        System.out.println("Asistent: " + super.toString());
    }
}
