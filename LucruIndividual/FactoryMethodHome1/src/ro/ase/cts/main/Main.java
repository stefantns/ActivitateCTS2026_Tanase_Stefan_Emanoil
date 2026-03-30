package ro.ase.cts.main;

import ro.ase.cts.clase.FelDeMancare;
import ro.ase.cts.enums.TipDesert;
import ro.ase.cts.enums.TipFelDeMancare;
import ro.ase.cts.enums.TipSupa;
import ro.ase.cts.fabrici.FabricaDesert;
import ro.ase.cts.fabrici.FabricaFelDeMancare;
import ro.ase.cts.fabrici.FabricaSupa;

public class Main {
    public static void main(String[] args) {
        FabricaFelDeMancare fabricaFelDeMancare1 = new FabricaSupa();
        FelDeMancare supaDeLegume = fabricaFelDeMancare1.creareFelDeMancare(TipSupa.SupaDeLegume, 100, 200);
        FelDeMancare supaDeVita = fabricaFelDeMancare1.creareFelDeMancare(TipSupa.SupaDeVita, 300, 4000);

        FabricaFelDeMancare fabricaFelDeMancare2 = new FabricaDesert();
        FelDeMancare clatite = fabricaFelDeMancare2.creareFelDeMancare(TipDesert.Clatite, 200, 100, 300);
        FelDeMancare papanasi = fabricaFelDeMancare2.creareFelDeMancare(TipDesert.Papanasi, 200, 300 ,1500);

        supaDeVita.afisareDescriere();
        supaDeLegume.afisareDescriere();
        clatite.afisareDescriere();
        papanasi.afisareDescriere();
    }
}
