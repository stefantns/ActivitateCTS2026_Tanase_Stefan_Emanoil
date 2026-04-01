package ro.ase.cts.factory;

import ro.ase.cts.clase.*;

public class FelPrincipalFactory {
    private FelPrincipalFactory(){}

    private static FelPrincipalFactory instanta = null;

    public static synchronized FelPrincipalFactory getInstance(){
        if(instanta == null){
            instanta = new FelPrincipalFactory();
        }
        return instanta;
    }

    public FelPrincipal getFelPrincipal(TipFelPrincipal type, String nume, double pret){
        return  switch (type){
            case PASTE -> new Paste(nume, pret);
            case BURGER -> new Burger(nume, pret);
            case STEAK -> new Steak(nume, pret);
        };
    }
}
