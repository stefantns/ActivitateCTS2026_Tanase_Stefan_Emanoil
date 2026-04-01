package ro.ase.cts.fabrici;

import ro.ase.cts.clase.*;

public class PizzaFactory {
    public static IPizza getPizza(TipPizza type, String nume, double pret){
           return switch (type){
               case DIAVOLA -> new Diavola(nume, pret);
               case MARGHERITA -> new Margherita(nume, pret);
               case CAPRICCIOSA -> new Capricciosa(nume, pret);
               case QUATROFORMAGGI -> new QuatroFormaggi(nume, pret);
               default -> null;
           };
    }
}
