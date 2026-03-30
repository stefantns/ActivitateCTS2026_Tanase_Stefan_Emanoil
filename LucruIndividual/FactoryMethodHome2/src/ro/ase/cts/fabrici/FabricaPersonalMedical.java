package ro.ase.cts.fabrici;

import ro.ase.cts.clase.Asistent;
import ro.ase.cts.clase.Brancardier;
import ro.ase.cts.clase.Medic;
import ro.ase.cts.clase.PersonalSpital;
import ro.ase.cts.enums.TipPersonalMedical;
import ro.ase.cts.enums.TipPersonalSpital;

public class FabricaPersonalMedical implements FabricaPersonalSpital {
    @Override
    public PersonalSpital crearePersonalSpital(TipPersonalSpital tip, String nume, int varsta, boolean medical) {
        return switch (tip) {
            case TipPersonalMedical.MEDIC -> new Medic(nume, varsta, medical);
            case TipPersonalMedical.ASISTENT -> new Asistent(nume, varsta, medical);
            case TipPersonalMedical.BRANCARDIER -> new Brancardier(nume, varsta, medical);
            default -> null;
        };
    }

    @Override
    public PersonalSpital crearePersonalSpital(TipPersonalSpital tip, String nume, int varsta) {
        return crearePersonalSpital(tip, nume, varsta, true);
    }
}
