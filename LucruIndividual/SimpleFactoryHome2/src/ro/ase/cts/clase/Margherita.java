package ro.ase.cts.clase;

public class Margherita extends PizzaAbstracta{
    public Margherita(String nume, double pret) {
        super(nume, pret);
    }

    @Override
    public void pizzaDetalii() {
        System.out.println("Margherita: " + super.toString() );
    }
}
