package ro.ase.cts.singleton;

import ro.ase.cts.clase.Bautura;
import ro.ase.cts.clase.ComandaManager;

import java.util.ArrayList;
import java.util.List;

public class CasaDeMarcat implements ComandaManager {
    private static CasaDeMarcat instanta = null;
    private List<Bautura> bauturiComanda;

    private CasaDeMarcat() {
        this.bauturiComanda = new ArrayList<>();
    }

    public static synchronized CasaDeMarcat getInstance(){
        if(instanta == null){
            instanta = new CasaDeMarcat();
        }
        return instanta;
    }

    @Override
    public void adaugaBautura(Bautura b) {
        if(b != null){
            this.bauturiComanda.add(b);
        }
        else {
            System.out.println("Bautura este invalida");
        }
    }

    @Override
    public void afisareBauturi() {
        for (Bautura b : bauturiComanda){
            System.out.println(b.toString());
        }
    }

    @Override
    public double calculeazaPretTotal() {
        double total = 0;
        for (Bautura b : bauturiComanda){
            total += b.getPret();
        }
        return  total;
    }
}
