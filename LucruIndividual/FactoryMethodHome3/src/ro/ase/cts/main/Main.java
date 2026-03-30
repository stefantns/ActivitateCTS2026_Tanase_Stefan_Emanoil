package ro.ase.cts.main;

import ro.ase.cts.clase.MijlocTransport;
import ro.ase.cts.enums.TipMijlocTransport;
import ro.ase.cts.enums.TipTransportSubteran;
import ro.ase.cts.enums.TipTransportTerestru;
import ro.ase.cts.factory.MijlocTransportFactory;
import ro.ase.cts.factory.TransportSubteranFactory;
import ro.ase.cts.factory.TransportTerestruFactory;

public class Main {
    public static void main(String[] args) {
        MijlocTransportFactory fabricaTerestru = new TransportTerestruFactory();
        MijlocTransport autobuz = fabricaTerestru.creareMijlocTransport(TipTransportTerestru.AUTOBUZ, "autobuz", 24, 21);
        MijlocTransport tramvai = fabricaTerestru.creareMijlocTransport(TipTransportTerestru.TRAMVAI, "tramvai", 22, 11);
        MijlocTransport troleibuz = fabricaTerestru.creareMijlocTransport(TipTransportTerestru.TROLEIBUZ, "troleibuz", 11, 12);

        MijlocTransportFactory fabricaSubteran = new TransportSubteranFactory();
        MijlocTransport tren = fabricaSubteran.creareMijlocTransport(TipTransportSubteran.TREN, "tren", 11, 12, 15);
        MijlocTransport metrou = fabricaSubteran.creareMijlocTransport(TipTransportSubteran.METROU, "metrou", 12, 12, 5);


        autobuz.afisareDescriere();
        tramvai.afisareDescriere();
        troleibuz.afisareDescriere();
        tren.afisareDescriere();
        metrou.afisareDescriere();
    }
}
