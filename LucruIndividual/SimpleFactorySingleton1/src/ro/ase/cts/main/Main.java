package ro.ase.cts.main;

import ro.ase.cts.factory.FabricaFlori;
import ro.ase.cts.factory.TipFloare;
import ro.ase.cts.model.BuchetManager;
import ro.ase.cts.model.Floare;
import ro.ase.cts.singleton.CasaDeMarcat;

public class Main {
    public static void main(String[] args) {
        Floare trandafirRosu = FabricaFlori.getFloare(TipFloare.TRANDAFIR, "Trandafir rosu", "rosu", 10);
        Floare trandafirAlb = FabricaFlori.getFloare(TipFloare.TRANDAFIR, "Trandafir alb", "alb", 15);
        Floare lalea = FabricaFlori.getFloare(TipFloare.LALEA,"lalea", "galbena",25);
        Floare orhidee = FabricaFlori.getFloare(TipFloare.ORHIDEE, "orhidee", "mov", 30);
        trandafirRosu.impacheteaza();
        lalea.impacheteaza();
        orhidee.impacheteaza();

        BuchetManager casa = CasaDeMarcat.getInstance();
        BuchetManager casa2 = CasaDeMarcat.getInstance();
        casa.adaugaFloare(trandafirAlb);
        casa.afisareFlori();
        casa2.adaugaFloare(lalea);
        casa.afisareFlori();
        casa.adaugaFloare(trandafirRosu);
        casa.adaugaFloare(orhidee);
        casa2.afisareFlori();
        System.out.println("Total buchet " + casa.calculeazaPretTotal());
    }
}
