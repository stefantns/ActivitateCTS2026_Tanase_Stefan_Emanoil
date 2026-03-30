package ro.ase.cts.clase;

public class Ceai extends BauturaAbstracta{
    public Ceai(String name, double volum, double pret) {
        super(name, volum, pret);
    }

    @Override
    public void metodaDePreparare() {
        System.out.println("se pune plicu in apa calda sssssssssssssss");
    }
}
