package ro.ase.cts.factory;

import ro.ase.cts.clase.Carte;
import ro.ase.cts.clase.Publicatie;
import ro.ase.cts.clase.Revista;
import ro.ase.cts.clase.Ziar;
import ro.ase.cts.enums.TipPublicatie;
import ro.ase.cts.enums.TipPublicatieFizica;

public class FabricaPublicatieFizica implements FabricaPublicatie{
    @Override
    public Publicatie crearePublicatie(TipPublicatie tip, String nume, String autor, int numarPagini) {
        return switch (tip){
            case TipPublicatieFizica.ZIAR -> new Ziar(nume, autor, numarPagini);
            case TipPublicatieFizica.CARTE -> new Carte(nume, autor, numarPagini);
            case TipPublicatieFizica.REVISTA -> new Revista(nume, autor, numarPagini);
            default -> null;
        };
    }

    @Override
    public Publicatie crearePublicatie(TipPublicatie tip, String nume, String autor, double dimensiune) {
        return null;
    }
}
