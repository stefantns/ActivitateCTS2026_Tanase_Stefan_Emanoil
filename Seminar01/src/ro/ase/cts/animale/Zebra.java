package ro.ase.cts.animale;

public class Zebra extends Animal{
    private int nrDungi;

    @Override
    public void eat(String name) {
        System.out.println("Zookeeperul " + name + " hraneste zebra " + super.name +" cu " + super.food);
    }

    public Zebra(String name, int age, int nrDungi, String food) {
        super(name, age,food);
        this.nrDungi = nrDungi;

    }
}
