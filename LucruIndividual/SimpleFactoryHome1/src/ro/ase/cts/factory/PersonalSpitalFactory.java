package ro.ase.cts.factory;

import ro.ase.cts.clase.Asistent;
import ro.ase.cts.clase.Brancardier;
import ro.ase.cts.clase.Medic;
import ro.ase.cts.clase.PersonalSpital;

public class PersonalSpitalFactory {
    public static PersonalSpital getPersonal(TipPersonal tip, String nume, int varsta, double salariu){
        return switch (tip){
            case MEDIC -> new Medic(nume, varsta, salariu);
            case ASISTENT -> new Asistent(nume, varsta, salariu);
            case BRANCARDIER -> new Brancardier(nume, varsta, salariu);
            default -> null;
        };
    }
}
