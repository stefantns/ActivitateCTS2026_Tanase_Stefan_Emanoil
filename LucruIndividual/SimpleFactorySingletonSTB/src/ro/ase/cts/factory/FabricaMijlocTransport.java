package ro.ase.cts.factory;

import ro.ase.cts.model.Autobuz;
import ro.ase.cts.model.MijlocTransport;
import ro.ase.cts.model.Tramvai;
import ro.ase.cts.model.Troleibuz;

public class FabricaMijlocTransport {
    public static MijlocTransport creeazaMijlocTransport(TipMijlocTransport tip, String nume, int numarLocuri, double pretBilet){
        switch (tip){
            case AUTOBUZ -> {
                return new Autobuz(nume, numarLocuri, pretBilet);
            }
            case TRAMVAI -> {
                return new Tramvai(nume, numarLocuri, pretBilet);
            }
            case TROLEIBUZ -> {
                return new Troleibuz(nume, numarLocuri, pretBilet);
            }
            default -> throw new IllegalArgumentException("Mijloc de transport invalid");
        }
    }
}
