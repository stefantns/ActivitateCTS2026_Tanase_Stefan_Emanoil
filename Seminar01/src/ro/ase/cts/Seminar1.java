package ro.ase.cts;

import ro.ase.cts.animale.Lion;
import ro.ase.cts.animale.Otter;
import ro.ase.cts.animale.Zebra;
import ro.ase.cts.zoo.ZOO;
import ro.ase.cts.zoo.ZooKeeper;

public class Seminar1 {
    public static void main(String[] args) {
        ZooKeeper keeper = new ZooKeeper("Popescu");
        ZOO zoo = new ZOO("Baneasa", keeper);
        zoo.addAnimal(new Lion("Leu1", 2, 100, "Carne"));
        zoo.addAnimal(new Lion("Leu2", 3, 150, "Carne"));
        zoo.addAnimal(new Zebra("Zebra1", 5, 100, "Fan"));
        zoo.addAnimal(new Zebra("Zebra2", 10, 200, "Iarba"));
        zoo.addAnimal(new Otter("Otter1", 10, "Peste", "apa"));
        zoo.feedAllAnimals();
    }
}
