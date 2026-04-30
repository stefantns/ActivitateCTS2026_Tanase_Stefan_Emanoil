package ro.ase.cts.main;

import ro.ase.cts.clase.Autobuz;
import ro.ase.cts.clase.AutobuzCursaSpeciala;
import ro.ase.cts.clase.AutobuzDeNoapte;
import ro.ase.cts.clase.MijlocDeTransport;

public class Main {
    public static void main(String[] args) {
        MijlocDeTransport mijlocDeTransport = new Autobuz("182", 30);
        MijlocDeTransport autobuzFaraCalatori = new Autobuz("182", 0);

        mijlocDeTransport.opresteInStatie();
        mijlocDeTransport.opresteInStatie();

        MijlocDeTransport autobuzDeNoapte = new AutobuzDeNoapte(mijlocDeTransport);
        autobuzDeNoapte.opresteInStatie();
        MijlocDeTransport autobuzDeNoapteFaraCalatori = new AutobuzDeNoapte(autobuzFaraCalatori);
        autobuzDeNoapteFaraCalatori.opresteInStatie();

        MijlocDeTransport autobuzSpecial = new AutobuzCursaSpeciala(new Autobuz("100 speciala", 25));
        autobuzSpecial.opresteInStatie();
    }
}
