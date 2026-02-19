package ro.ase.cts.animale;

public abstract class Animal {
    protected String name;
    protected int age;
    protected String food;

    public abstract void eat(String numeZooKeeper);

    public Animal(String name, int age, String food) {
        this.name = name;
        this.age = age;
        this.food = food;
    }
}
