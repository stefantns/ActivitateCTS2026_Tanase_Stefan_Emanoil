package ro.ase.cts.factory;

import ro.ase.cts.vehicule.Autobuz;
import ro.ase.cts.vehicule.MijlocTransport;
import ro.ase.cts.vehicule.Tramvai;
import ro.ase.cts.vehicule.Troleibuz;

public class MijlocTransportFactory {
    public static MijlocTransportFactory instance = null;

    public static MijlocTransportFactory getInstance(){
        if(instance == null){
            instance = new MijlocTransportFactory();
        }
        return instance;
    }

    private MijlocTransportFactory(){}

    public static MijlocTransport getMijlocTransport(String marca, int linie, MijlocTransportType tip) throws Exception {
        if(tip == MijlocTransportType.AUTOBUZ){
            return new Autobuz(marca, linie);
        }
        if(tip == MijlocTransportType.TRAMVAI){
            return new Tramvai(marca, linie);
        }
        if(tip == MijlocTransportType.TROLEIBUZ){
            return new Troleibuz(marca, linie);
        }
        throw new Exception("Tip invalid");
    }
}
