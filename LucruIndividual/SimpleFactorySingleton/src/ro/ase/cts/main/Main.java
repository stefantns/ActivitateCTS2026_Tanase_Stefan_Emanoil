package ro.ase.cts.main;

import ro.ase.cts.clase.Bautura;
import ro.ase.cts.clase.ComandaManager;
import ro.ase.cts.factory.FabricaBauturi;
import ro.ase.cts.factory.TipBautura;
import ro.ase.cts.singleton.CasaDeMarcat;

public class Main {
    public static void main(String[] args) {
        Bautura ceai = FabricaBauturi.getBautura(TipBautura.CEAI, "Ceai verde", 200, 3500);
        Bautura flatWhite = FabricaBauturi.getBautura(TipBautura.CAFEA, "Flat white", 250, 1000);
        Bautura capuccino = FabricaBauturi.getBautura(TipBautura.CAFEA, "Capuccino", 300, 1500);
        Bautura ciocolataCalda = FabricaBauturi.getBautura(TipBautura.CIOCOLATA_CALDA, "Ciocolata calda", 150, 250);
        ceai.prepara();
        flatWhite.prepara();
        capuccino.prepara();
        ciocolataCalda.prepara();


        ComandaManager casa = CasaDeMarcat.getInstance();
        ComandaManager casa2 = CasaDeMarcat.getInstance();
        casa.adaugaBautura(ceai);
        casa2.adaugaBautura(capuccino);
        casa.afisareBauturi();
        casa2.adaugaBautura(ciocolataCalda);
        casa.afisareBauturi();
        casa2.afisareBauturi();
        System.out.println("Total comanda:" + casa.calculeazaPretTotal());
    }
}
