package ro.ase.cts.main;

import ro.ase.cts.clase.Autobuz;
import ro.ase.cts.clase.LinieFactory;

public class Main {
    public static void main(String[] args) {
        Autobuz autobuz1 = new Autobuz("electric", 2020, 30);
        Autobuz autobuz2 = new Autobuz("rapid", 2021, 22);
        Autobuz autobuz3 = new Autobuz("slow", 2021, 11);

        LinieFactory linieFactory = new LinieFactory();
        linieFactory.getLinie(102, "CFR", "Pantelimon").afiseazaAutobuzLinie(autobuz1);
        linieFactory.getLinie(102, "Romana", "Universitate").afiseazaAutobuzLinie(autobuz2);
        linieFactory.getLinie(102, "CFR", "").afiseazaAutobuzLinie(autobuz3);
    }
}
