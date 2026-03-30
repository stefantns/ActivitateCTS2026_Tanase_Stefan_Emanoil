package ro.ase.cts.fabrici;

import ro.ase.cts.clase.Clatite;
import ro.ase.cts.clase.FelDeMancare;
import ro.ase.cts.clase.Papanasi;
import ro.ase.cts.enums.TipDesert;
import ro.ase.cts.enums.TipFelDeMancare;
import ro.ase.cts.enums.TipSupa;

public class FabricaDesert implements FabricaFelDeMancare{
    @Override
    public FelDeMancare creareFelDeMancare(TipFelDeMancare tip, int gramaj, double pret) {
        return creareFelDeMancare(tip, gramaj, pret, 150);
    }

    @Override
    public FelDeMancare creareFelDeMancare(TipFelDeMancare tip, int gramaj, double pret, int calorii) {
        return switch (tip){
            case TipDesert.Clatite -> new Clatite(gramaj, pret, calorii);
            case TipDesert.Papanasi -> new Papanasi(gramaj, pret, calorii);
            default -> null;
        };
    }
}
