package ro.ase.cts.main;

import ro.ase.cts.clase.PersonalSpital;
import ro.ase.cts.factory.PersonalSpitalFactory;
import ro.ase.cts.factory.TipPersonal;

public class Main {
    public static void main(String[] args) {
        PersonalSpital asistent = PersonalSpitalFactory.getPersonal(TipPersonal.ASISTENT, "asistent", 12, 1200);
        PersonalSpital medic = PersonalSpitalFactory.getPersonal(TipPersonal.MEDIC, "medic", 12, 2300);
        PersonalSpital brancardier = PersonalSpitalFactory.getPersonal(TipPersonal.BRANCARDIER, "brancardier", 123, 200);

        asistent.afisareDescriere();
        medic.afisareDescriere();
        brancardier.afisareDescriere();
    }
}
