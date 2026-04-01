package ro.ase.cts.main;

import ro.ase.cts.clase.AbstractMasaBuilder;
import ro.ase.cts.clase.Masa;
import ro.ase.cts.clase.MasaBuilder;

public class Main {
    public static void main(String[] args) {
        AbstractMasaBuilder builder = new MasaBuilder();
        Masa masa = builder.setLumanari(true).setFataDeMasaPremium(true).build(5);
        System.out.println(masa.toString());
    }
}
