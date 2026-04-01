package ro.ase.cts.main;

import ro.ase.cts.clase.IPizza;
import ro.ase.cts.fabrici.PizzaFactory;
import ro.ase.cts.fabrici.TipPizza;

public class Main {
    public static void main(String[] args) {
        IPizza diavola = PizzaFactory.getPizza(TipPizza.DIAVOLA, "diavola", 12);
        IPizza capricciosa = PizzaFactory.getPizza(TipPizza.CAPRICCIOSA, "capricciosa", 13);
        IPizza margherita = PizzaFactory.getPizza(TipPizza.MARGHERITA, "margherita", 132);
        IPizza quatroform = PizzaFactory.getPizza(TipPizza.QUATROFORMAGGI, "quatro", 33);

        diavola.pizzaDetalii();
        capricciosa.pizzaDetalii();
        margherita.pizzaDetalii();
        quatroform.pizzaDetalii();
    }
}
