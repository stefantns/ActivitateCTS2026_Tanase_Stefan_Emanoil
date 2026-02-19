package ro.ase.cts.animale;

public abstract class Animal {
    private String name;
    private int age;
    public abstract void eat(String food, String numeZooKeeper);

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
