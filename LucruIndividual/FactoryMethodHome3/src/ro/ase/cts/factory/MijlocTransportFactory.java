package ro.ase.cts.factory;

import ro.ase.cts.clase.MijlocTransport;
import ro.ase.cts.enums.TipMijlocTransport;

public interface MijlocTransportFactory {
    MijlocTransport creareMijlocTransport(TipMijlocTransport tip, String nume, int numarLocuri, int numarStatii); // terestru
    MijlocTransport creareMijlocTransport(TipMijlocTransport tip, String nume, int numarLocuri, int numarStatii, int adancime); // subteran
}
