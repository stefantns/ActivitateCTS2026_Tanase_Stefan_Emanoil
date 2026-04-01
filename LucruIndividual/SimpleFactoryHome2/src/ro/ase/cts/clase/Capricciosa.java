package ro.ase.cts.clase;

public class Capricciosa extends PizzaAbstracta{
    public Capricciosa(String nume, double pret) {
        super(nume, pret);
    }

    @Override
    public void pizzaDetalii() {
        System.out.println("Capricciosa: " + super.toString());
    }
}
