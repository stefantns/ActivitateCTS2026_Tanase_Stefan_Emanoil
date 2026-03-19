package ro.ase.cts.main;

import ro.ase.cts.clase.FelDeMancare;
import ro.ase.cts.clase.Papanasi;
import ro.ase.cts.clase.Supa;
import ro.ase.cts.enums.TipDesert;
import ro.ase.cts.enums.TipSupa;
import ro.ase.cts.fabrici.FabricaDesert;
import ro.ase.cts.fabrici.FabricaFelDeMancare;
import ro.ase.cts.fabrici.FabricaSupa;

public class Main {
    public static void main(String[] args) {
        FabricaFelDeMancare fabricaFelDeMancare = new FabricaSupa();
        FelDeMancare supaDeVita = fabricaFelDeMancare.creeareFelDeMancare(TipSupa.SupaDeVita, 200, 150.23);
        FelDeMancare supaDeLegume = fabricaFelDeMancare.creeareFelDeMancare(TipSupa.SupaDeLegume, 200, 180.99);

        FabricaFelDeMancare fabricaFelDeMancare1 = new FabricaDesert();
        FelDeMancare papanasi = fabricaFelDeMancare1.creeareFelDeMancare(TipDesert.Papanasi, 200, 155, 230);
        FelDeMancare clatite = fabricaFelDeMancare1.creeareFelDeMancare(TipDesert.Clatite, 200, 160, 350);

        supaDeVita.afisareDescriere();
        supaDeLegume.afisareDescriere();
        papanasi.afisareDescriere();
        clatite.afisareDescriere();
    }
}
