package ro.ase.cts.main;

import ro.ase.cts.clase.PrototypeRezervare;
import ro.ase.cts.clase.Rezervare;

public class Main {
    public static void main(String[] args) {
        PrototypeRezervare rezervare1 = new Rezervare("Georgelica", 2, "15:44", "0729874659");
        PrototypeRezervare rezervare2 = rezervare1.copiaza();

        ((Rezervare) rezervare1).setOra("17:22");
        ((Rezervare) rezervare1).setNrPersoane(25);

        System.out.println(rezervare1.toString());
        System.out.println(rezervare2.toString());
    }
}
