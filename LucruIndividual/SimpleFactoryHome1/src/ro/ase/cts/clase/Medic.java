package ro.ase.cts.clase;

public class Medic extends PersonalAbstract{
    public Medic(String nume, int varsta, double salariu) {
        super(nume, varsta, salariu);
    }

    @Override
    public void afisareDescriere() {
        System.out.println("Medic: " + super.toString());
    }
}
