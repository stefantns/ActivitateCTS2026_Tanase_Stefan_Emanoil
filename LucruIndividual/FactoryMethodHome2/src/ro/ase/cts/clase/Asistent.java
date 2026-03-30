package ro.ase.cts.clase;

public class Asistent extends PersonalMedical{
    public Asistent(String nume, int varsta, boolean medical) {
        super(nume, varsta, medical);
    }

    @Override
    public void afisareDescriere() {
        System.out.println("Asistent: " + super.toString());
    }
}
