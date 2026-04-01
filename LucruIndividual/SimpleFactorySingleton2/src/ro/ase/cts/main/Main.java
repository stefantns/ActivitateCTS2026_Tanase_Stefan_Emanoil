package ro.ase.cts.main;

import ro.ase.cts.clase.FelPrincipal;
import ro.ase.cts.factory.FelPrincipalFactory;
import ro.ase.cts.factory.TipFelPrincipal;

public class Main {
    public static void main(String[] args) {
        FelPrincipalFactory factory = FelPrincipalFactory.getInstance();
        FelPrincipal burger = factory.getFelPrincipal(TipFelPrincipal.BURGER, "burger", 12);
        FelPrincipal paste = factory.getFelPrincipal(TipFelPrincipal.PASTE, "paste", 1313);
        FelPrincipal steak= factory.getFelPrincipal(TipFelPrincipal.STEAK, "steak", 12);

        burger.afiseazaDetalii();
        paste.afiseazaDetalii();
        steak.afiseazaDetalii();
    }
}
