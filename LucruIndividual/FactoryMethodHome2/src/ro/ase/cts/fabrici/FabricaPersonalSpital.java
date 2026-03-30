package ro.ase.cts.fabrici;

import ro.ase.cts.clase.PersonalSpital;
import ro.ase.cts.enums.TipPersonalSpital;

public interface FabricaPersonalSpital {
    PersonalSpital crearePersonalSpital(TipPersonalSpital tip, String nume, int varsta, boolean medical); //medical
    PersonalSpital crearePersonalSpital(TipPersonalSpital tip, String nume, int varsta); //nonmedical
}
