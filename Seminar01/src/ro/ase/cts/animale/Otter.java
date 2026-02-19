package ro.ase.cts.animale;

public class Otter extends Animal{
    private String tip;

    public Otter(String name, int age, String food, String tip) {
        super(name, age, food);
        this.tip = tip;
    }

    @Override
    public void eat(String numeZooKeeper) {
        System.out.println("Zookeeperul " + numeZooKeeper + " hraneste vidra "+ super.name+ " cu " + super.food);
    }
}