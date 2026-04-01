package ro.ase.cts.clase;

public class QuatroFormaggi extends PizzaAbstracta{
    public QuatroFormaggi(String nume, double pret) {
        super(nume, pret);
    }

    @Override
    public void pizzaDetalii() {
        System.out.println("qutro formaggi: " + super.toString());
    }
}
