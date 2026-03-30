package ro.ase.cts.singleton;

import ro.ase.cts.model.BuchetManager;
import ro.ase.cts.model.Floare;

import java.util.ArrayList;
import java.util.List;

public class CasaDeMarcat implements BuchetManager {
    private static CasaDeMarcat instanta = null;
    private List<Floare> flori;

    private CasaDeMarcat() {
        flori = new ArrayList<>();
    }

    public static synchronized CasaDeMarcat getInstance() {
        if (instanta == null) {
            instanta = new CasaDeMarcat();
        }
        return instanta;
    }

    @Override
    public void adaugaFloare(Floare f) {
        this.flori.add(f);
    }

    @Override
    public void afisareFlori() {
        for (Floare f : flori) {
            System.out.println(f.toString());
        }
    }

    @Override
    public double calculeazaPretTotal() {
        double total = 0;
        for (Floare f : flori) {
            total += f.getPret();
        }
        return total;
    }
}
