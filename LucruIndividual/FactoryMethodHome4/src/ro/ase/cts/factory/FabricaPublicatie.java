package ro.ase.cts.factory;

import ro.ase.cts.clase.Publicatie;
import ro.ase.cts.enums.TipPublicatie;

public interface FabricaPublicatie {
    Publicatie crearePublicatie(TipPublicatie tip, String nume, String autor, int numarPagini);
    Publicatie crearePublicatie(TipPublicatie tip, String nume, String autor, double dimensiune);
}
