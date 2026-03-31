package ro.ase.cts.main;

import ro.ase.cts.clase.Publicatie;
import ro.ase.cts.enums.TipPublicatieDigitala;
import ro.ase.cts.enums.TipPublicatieFizica;
import ro.ase.cts.factory.FabricaPublicatie;
import ro.ase.cts.factory.FabricaPublicatieDigitala;
import ro.ase.cts.factory.FabricaPublicatieFizica;

public class Main {
    public static void main(String[] args) {
        FabricaPublicatie fabricaDigitala = new FabricaPublicatieDigitala();
        Publicatie audiobook = fabricaDigitala.crearePublicatie(TipPublicatieDigitala.AUDIOBOOK, "audiobook", "autor1", 24);
        Publicatie podcast = fabricaDigitala.crearePublicatie(TipPublicatieDigitala.PODCAST, "podacast", "autor2", 22);
        Publicatie ebook = fabricaDigitala.crearePublicatie(TipPublicatieDigitala.EBOOK, "ebook", "autor3", 25);

        FabricaPublicatie fabricaFizica = new FabricaPublicatieFizica();
        Publicatie carte = fabricaFizica.crearePublicatie(TipPublicatieFizica.CARTE, "carte", "autor4", 11);
        Publicatie revista = fabricaFizica.crearePublicatie(TipPublicatieFizica.REVISTA, "revista", "autor5", 22);
        Publicatie ziar = fabricaFizica.crearePublicatie(TipPublicatieFizica.ZIAR, "ziar", "autor6", 345);

        audiobook.afisareDescriere();
        podcast.afisareDescriere();
        ebook.afisareDescriere();
        carte.afisareDescriere();
        revista.afisareDescriere();
        ziar.afisareDescriere();
    }
}
