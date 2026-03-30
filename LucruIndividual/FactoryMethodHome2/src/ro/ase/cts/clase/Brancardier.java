package ro.ase.cts.clase;

public class Brancardier extends PersonalMedical{
    public Brancardier(String nume, int varsta, boolean medical) {
        super(nume, varsta,medical);
    }

    @Override
    public void afisareDescriere() {
        System.out.println("Brancardier: " + super.toString());
    }
}
