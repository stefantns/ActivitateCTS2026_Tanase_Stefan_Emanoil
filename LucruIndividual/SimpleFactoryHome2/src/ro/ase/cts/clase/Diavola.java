package ro.ase.cts.clase;

public class Diavola extends PizzaAbstracta{
    public Diavola(String nume, double pret) {
        super(nume, pret);
    }

    @Override
    public void pizzaDetalii() {
        System.out.println("Diavola: " + super.toString());
    }
}
