package ro.ase.cts.factory;

import ro.ase.cts.clase.Autobuz;
import ro.ase.cts.clase.MijlocTransport;
import ro.ase.cts.clase.Tramvai;
import ro.ase.cts.clase.Troleibuz;
import ro.ase.cts.enums.TipMijlocTransport;
import ro.ase.cts.enums.TipTransportTerestru;

public class TransportTerestruFactory implements MijlocTransportFactory{
    @Override
    public MijlocTransport creareMijlocTransport(TipMijlocTransport tip, String nume, int numarLocuri, int numarStatii) {
        return switch (tip){
            case TipTransportTerestru.AUTOBUZ -> new Autobuz(nume, numarLocuri, numarStatii);
            case TipTransportTerestru.TRAMVAI -> new Tramvai(nume, numarLocuri, numarStatii);
            case TipTransportTerestru.TROLEIBUZ -> new Troleibuz(nume, numarLocuri, numarStatii);
            default -> null;
        };
    }

    @Override
    public MijlocTransport creareMijlocTransport(TipMijlocTransport tip, String nume, int numarLocuri, int numarStatii, int adancime) {
        return null;
    }
}
