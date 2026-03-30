package ro.ase.cts.main;

import ro.ase.cts.clase.PersonalSpital;
import ro.ase.cts.enums.TipPersonalMedical;
import ro.ase.cts.enums.TipPersonalNonMedical;
import ro.ase.cts.fabrici.FabricaPersonalMedical;
import ro.ase.cts.fabrici.FabricaPersonalNonMedical;
import ro.ase.cts.fabrici.FabricaPersonalSpital;

public class Main {
    public static void main(String[] args) {
        FabricaPersonalSpital fabricaPersonalSpital1 = new FabricaPersonalMedical();
        PersonalSpital asistent = fabricaPersonalSpital1.crearePersonalSpital(TipPersonalMedical.ASISTENT, "Bianca", 25, true);
        PersonalSpital medic = fabricaPersonalSpital1.crearePersonalSpital(TipPersonalMedical.MEDIC, "Stefan", 22, true);
        PersonalSpital brancardier = fabricaPersonalSpital1.crearePersonalSpital(TipPersonalMedical.BRANCARDIER, "Stefanelul", 19, true);

        FabricaPersonalSpital fabricaPersonalSpital2 = new FabricaPersonalNonMedical();
        PersonalSpital secretar = fabricaPersonalSpital2.crearePersonalSpital(TipPersonalNonMedical.SECRETAR, "Emanoil", 22);
        PersonalSpital registrator = fabricaPersonalSpital2.crearePersonalSpital(TipPersonalNonMedical.REGISTRATOR, "Biencuta", 35);

        asistent.afisareDescriere();
        medic.afisareDescriere();
        brancardier.afisareDescriere();
        secretar.afisareDescriere();
        registrator.afisareDescriere();
    }
}
