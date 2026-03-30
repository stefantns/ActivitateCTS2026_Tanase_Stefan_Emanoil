package ro.ase.cts.fabrici;

import ro.ase.cts.clase.PersonalSpital;
import ro.ase.cts.clase.Registrator;
import ro.ase.cts.clase.Secretar;
import ro.ase.cts.enums.TipPersonalMedical;
import ro.ase.cts.enums.TipPersonalNonMedical;
import ro.ase.cts.enums.TipPersonalSpital;

public class FabricaPersonalNonMedical implements FabricaPersonalSpital{
    @Override
    public PersonalSpital crearePersonalSpital(TipPersonalSpital tip, String nume, int varsta, boolean medical) {
        return crearePersonalSpital(tip,nume,varsta);
    }

    @Override
    public PersonalSpital crearePersonalSpital(TipPersonalSpital tip, String nume, int varsta) {
        return switch (tip){
            case TipPersonalNonMedical.REGISTRATOR -> new Registrator(nume, varsta);
            case TipPersonalNonMedical.SECRETAR -> new Secretar(nume, varsta);
            default -> null;
        };
    }
}
