package ro.ase.cts.main;

import ro.ase.cts.factory.MijlocTransportFactory;
import ro.ase.cts.factory.MijlocTransportType;
import ro.ase.cts.vehicule.MijlocTransport;

public class Main {
    public static void afisareMijlocTransport(MijlocTransport mijlocTransport){
        mijlocTransport.afisareDescriere();
    }


    public static void main(String[] args) throws Exception {
        MijlocTransportFactory factory = MijlocTransportFactory.getInstance();

        MijlocTransport autobuz = MijlocTransportFactory.getMijlocTransport("Mercedes", 100, MijlocTransportType.AUTOBUZ);
        MijlocTransport tramvai = MijlocTransportFactory.getMijlocTransport("Astra", 1, MijlocTransportType.TRAMVAI);
        MijlocTransport troleibuz = MijlocTransportFactory.getMijlocTransport("Mercedes", 97, MijlocTransportType.TROLEIBUZ);

        afisareMijlocTransport(MijlocTransportFactory.getMijlocTransport("Mercedes", 100, MijlocTransportType.AUTOBUZ));
        afisareMijlocTransport(MijlocTransportFactory.getMijlocTransport("Astra", 1, MijlocTransportType.TRAMVAI));
        afisareMijlocTransport(MijlocTransportFactory.getMijlocTransport("Mercedes", 97, MijlocTransportType.TROLEIBUZ));
    }
}
