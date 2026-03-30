package ro.ase.cts.singleton;

import ro.ase.cts.model.DispeceratManager;
import ro.ase.cts.model.MijlocTransport;

import java.util.ArrayList;
import java.util.List;

public class Dispecerat implements DispeceratManager {
    private static Dispecerat instanta = null;
    private List<MijlocTransport> vehicule;

    private Dispecerat() {
        vehicule = new ArrayList<>();
    }

    public static synchronized Dispecerat getInstance(){
        if(instanta == null){
            instanta = new Dispecerat();
        }
        return instanta;
    }

    @Override
    public void adaugaVehicul(MijlocTransport m) {
        this.vehicule.add(m);
    }

    @Override
    public void afisareVehicule() {
        for (MijlocTransport m : vehicule){
            System.out.println(m.toString());
        }
    }

    @Override
    public double calculeazaCostTotal() {
        double total =0;
        for (MijlocTransport m : vehicule){
            total += m.getPretBilet();
        }
        return total;
    }
}
