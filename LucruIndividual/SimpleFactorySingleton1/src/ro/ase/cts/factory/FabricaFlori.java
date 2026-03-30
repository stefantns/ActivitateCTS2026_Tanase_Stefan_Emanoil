package ro.ase.cts.factory;

import ro.ase.cts.model.Floare;
import ro.ase.cts.model.Lalea;
import ro.ase.cts.model.Orhidee;
import ro.ase.cts.model.Trandafir;

public class FabricaFlori {
    public static Floare getFloare(TipFloare tip, String nume, String culoare, double pret){
        switch (tip){
            case TRANDAFIR -> {
                return new Trandafir(nume, culoare, pret);
            }
            case LALEA -> {
                return new Lalea(nume, culoare, pret);
            }
            case ORHIDEE -> {
                return new Orhidee(nume, culoare, pret);
            }
            default -> throw new IllegalArgumentException("Floare invalida");
        }
    }
}
