package ro.ase.cts.factory;

import ro.ase.cts.clase.Metrou;
import ro.ase.cts.clase.MijlocTransport;
import ro.ase.cts.clase.Tren;
import ro.ase.cts.enums.TipMijlocTransport;
import ro.ase.cts.enums.TipTransportSubteran;

public class TransportSubteranFactory implements MijlocTransportFactory {
    @Override
    public MijlocTransport creareMijlocTransport(TipMijlocTransport tip, String nume, int numarLocuri, int numarStatii) {
        return null;
    }

    @Override
    public MijlocTransport creareMijlocTransport(TipMijlocTransport tip, String nume, int numarLocuri, int numarStatii, int adancime) {
        return switch (tip) {
            case TipTransportSubteran.METROU -> new Metrou(nume, numarLocuri, adancime, numarStatii);
            case TipTransportSubteran.TREN -> new Tren(nume, numarLocuri, adancime, numarStatii);
            default -> null;
        };
    }
}
