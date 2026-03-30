package ro.ase.cts.factory;

import ro.ase.cts.clase.Bautura;
import ro.ase.cts.clase.Cafea;
import ro.ase.cts.clase.Ceai;
import ro.ase.cts.clase.CiocolataCalda;

public class FabricaBauturi {
    public static Bautura getBautura(TipBautura tip, String nume, int volum, double pret){
        switch (tip){
            case CAFEA -> {
                return new Cafea(nume, volum, pret);
            }
            case CEAI -> {
                return new Ceai(nume, volum, pret);
            }
            case CIOCOLATA_CALDA -> {
                return new CiocolataCalda(nume, volum, pret);
            }
            default -> throw new IllegalArgumentException("Bautura invalida");
        }
    }
}
