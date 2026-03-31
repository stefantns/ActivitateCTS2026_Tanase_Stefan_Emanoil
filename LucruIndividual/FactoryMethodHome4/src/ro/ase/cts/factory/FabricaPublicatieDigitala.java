package ro.ase.cts.factory;

import ro.ase.cts.clase.Audiobook;
import ro.ase.cts.clase.Ebook;
import ro.ase.cts.clase.Podcast;
import ro.ase.cts.clase.Publicatie;
import ro.ase.cts.enums.TipPublicatie;
import ro.ase.cts.enums.TipPublicatieDigitala;


public class FabricaPublicatieDigitala implements FabricaPublicatie{
    @Override
    public Publicatie crearePublicatie(TipPublicatie tip, String nume, String autor, int numarPagini) {
        return null;
    }

    @Override
    public Publicatie crearePublicatie(TipPublicatie tip, String nume, String autor, double dimensiune) {
        return switch (tip){
            case TipPublicatieDigitala.EBOOK -> new Ebook(nume, autor, dimensiune);
            case TipPublicatieDigitala.PODCAST -> new Podcast(nume, autor, dimensiune);
            case TipPublicatieDigitala.AUDIOBOOK -> new Audiobook(nume, autor, dimensiune);
            default -> null;
        };
    }
}
