package ro.ase.cts.main;

import ro.ase.cts.clase.Medic;
import ro.ase.cts.clase.Pacient;
import ro.ase.cts.clase.Salon;
import ro.ase.cts.clase.Spital;

public class Main {
    public static void main(String[] args) {
        Pacient pacient1 = new Pacient("dorel", 7);
        Pacient pacient2 = new Pacient("marius", 3);
        Pacient pacient3 = new Pacient("gigel", 6);
        Pacient pacient4 = new Pacient("darius", 5);
        Salon salon = new Salon();
        Medic medic = new Medic();
        Spital spital = new Spital(salon,medic);
        spital.internarePacient(pacient1);
        spital.internarePacient(pacient2);
        spital.internarePacient(pacient3);
        spital.internarePacient(pacient4);

    }
}
