package ro.ase.cts.main;

import ro.ase.cts.clase.Bautura;
import ro.ase.cts.clase.BauturaPresetata;
import ro.ase.cts.clase.PrototypeBauturaPresetata;
import ro.ase.cts.factory.BauturaFactory;
import ro.ase.cts.factory.TipBautura;

public class Main {
    public static void main(String[] args) {
        Bautura machiatto = BauturaFactory.creareBautura(TipBautura.Cafea,"MACHIATTO",300.0,32.5);
        Bautura ceai = BauturaFactory.creareBautura(TipBautura.Ceai,"ceiut",400.0,20.5);
        Bautura cioco = BauturaFactory.creareBautura(TipBautura.CiocolataCalda,"ciocolatica",250.0,15.5);

        System.out.println(machiatto);
        System.out.println(ceai);
        System.out.println(cioco);

        machiatto.metodaDePreparare();
        ceai.metodaDePreparare();
        cioco.metodaDePreparare();

        PrototypeBauturaPresetata bauturaPresetata = new BauturaPresetata("cioclici", 1335.0, 175.22);
        PrototypeBauturaPresetata bautura1 = bauturaPresetata.clone();
        ((BauturaPresetata)bautura1).setName("noaptebuna");

        System.out.println(bautura1);
        System.out.println(bauturaPresetata);
    }
}
