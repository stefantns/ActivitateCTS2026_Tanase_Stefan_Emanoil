package ro.ase.cts.main;

import ro.ase.cts.clase.AbstractRezervareBuilder;
import ro.ase.cts.clase.Rezervare;
import ro.ase.cts.clase.RezervareBuilder;

public class Main {
    public static void main(String[] args) {
        AbstractRezervareBuilder builder = new RezervareBuilder();
        Rezervare rezervare1 = builder.setAsezareLaGeam(true).setDecorareMasa(true).setMuzicaAmbientala(true).setGenMuzica("Mioritic").build("Stefan");
        AbstractRezervareBuilder builder2 = new RezervareBuilder();
        Rezervare rezervare2 = builder2.setAsezareLaGeam(true).setScauneErgonomice(true).build("Marius");
        System.out.println(rezervare1.toString());
        System.out.println(rezervare2.toString());
    }
}
