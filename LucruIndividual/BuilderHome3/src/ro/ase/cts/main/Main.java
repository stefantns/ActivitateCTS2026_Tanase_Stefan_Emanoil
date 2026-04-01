package ro.ase.cts.main;

import ro.ase.cts.clase.AbstractComandaBuilder;
import ro.ase.cts.clase.Comanda;
import ro.ase.cts.clase.ComandaBuilder;

public class Main {
    public static void main(String[] args) {
        AbstractComandaBuilder builder = new ComandaBuilder();
        Comanda comanda1 = builder.setSupaInclusa(true).setDesertInclus(true).setPortieMare(true).build("Stefan", 5);
        System.out.println(comanda1.toString());
    }

}
