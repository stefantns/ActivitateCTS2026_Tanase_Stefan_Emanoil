package ro.ase.cts.main;

import ro.ase.cts.factory.FabricaMijlocTransport;
import ro.ase.cts.factory.TipMijlocTransport;
import ro.ase.cts.model.DispeceratManager;
import ro.ase.cts.model.MijlocTransport;
import ro.ase.cts.singleton.Dispecerat;

public class Main {
    public static void main(String[] args) {
        MijlocTransport autobuz = FabricaMijlocTransport.creeazaMijlocTransport(TipMijlocTransport.AUTOBUZ, "Autobuz", 25, 235);
        MijlocTransport tramvai = FabricaMijlocTransport.creeazaMijlocTransport(TipMijlocTransport.TRAMVAI, "Tramvai", 30, 150);
        MijlocTransport troleibuz = FabricaMijlocTransport.creeazaMijlocTransport(TipMijlocTransport.TROLEIBUZ, "Troleibuz", 15, 100);
        autobuz.porneste();
        tramvai.porneste();
        tramvai.porneste();

        DispeceratManager dispecerat1 = Dispecerat.getInstance();
        DispeceratManager dispecerat2 = Dispecerat.getInstance();
        dispecerat1.adaugaVehicul(autobuz);
        dispecerat1.afisareVehicule();
        dispecerat2.adaugaVehicul(troleibuz);
        dispecerat2.adaugaVehicul(tramvai);
        dispecerat2.afisareVehicule();
        dispecerat1.afisareVehicule();
        System.out.println("Cost total: " + dispecerat1.calculeazaCostTotal());
    }
}
