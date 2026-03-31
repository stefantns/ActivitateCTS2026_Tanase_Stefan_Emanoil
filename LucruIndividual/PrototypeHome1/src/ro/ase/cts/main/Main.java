package ro.ase.cts.main;

import ro.ase.cts.clase.PrototypeReteta;
import ro.ase.cts.clase.Reteta;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> ingrediente = new ArrayList<>();
        List<Integer> cantitati = new ArrayList<>();
        ingrediente.add("cacao");
        ingrediente.add("lapte");
        ingrediente.add("cafea");
        cantitati.add(2);
        cantitati.add(3);
        cantitati.add(4);

        PrototypeReteta reteta1 = new Reteta(ingrediente, cantitati);
        PrototypeReteta retetaCopiata = reteta1.copiaza();

        System.out.println(reteta1.toString());
        System.out.println(retetaCopiata.toString());

        ingrediente.removeAll(ingrediente);
        ingrediente.add("laptic");
        ingrediente.add("seminte");
        ingrediente.add("chips");
        cantitati.removeAll(cantitati);
        cantitati.add(2);
        cantitati.add(5);
        cantitati.add(9);

        ((Reteta)retetaCopiata).setCantitate(cantitati);
        ((Reteta)retetaCopiata).setIngrediente(ingrediente);
        System.out.println(reteta1);
        System.out.println(retetaCopiata);
    }
}
