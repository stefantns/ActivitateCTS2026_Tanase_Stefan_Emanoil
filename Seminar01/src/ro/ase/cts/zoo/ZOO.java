package ro.ase.cts.zoo;

import ro.ase.cts.animale.Animal;

import java.util.ArrayList;
import java.util.List;

public class ZOO {
    private String name;
    private ZooKeeper keeper;
    private List<Animal> animale;

    public ZOO(String name, ZooKeeper keeper, List<Animal> animale) {
        this.name = name;
        this.keeper = keeper;
        this.animale = animale;
    }

    public ZOO(String name, ZooKeeper keeper) {
        this.name = name;
        this.keeper = keeper;
        this.animale = new ArrayList<>();
    }

    public void addAnimal(Animal animal){
        animale.add(animal);
    }

    public void feedAllAnimals(){
        for (Animal a: animale){
            keeper.feedAnimal(a);
        }
    }
}
