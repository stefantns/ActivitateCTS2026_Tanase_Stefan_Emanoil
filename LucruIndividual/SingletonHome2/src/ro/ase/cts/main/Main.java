package ro.ase.cts.main;

import ro.ase.cts.lazy.SistemLogare;

public class Main {
    public static void main(String[] args) {
        SistemLogare logare1 = SistemLogare.getInstance("Fisier.log", 12, "12/12/2021");
        logare1.afisareDescriere();
        SistemLogare logare2 = SistemLogare.getInstance("StefanLog.log", 11, "11/12/2003");
        logare2.afisareDescriere();
    }
}
