package ro.ase.cts.clase;

public class Medic extends PersonalMedical{
    public Medic(String nume, int varsta, boolean medical) {
        super(nume, varsta, medical);
    }

    @Override
    public void afisareDescriere() {
        System.out.println("Medic: " + super.toString());
    }
}
