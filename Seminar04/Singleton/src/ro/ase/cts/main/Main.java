package ro.ase.cts.main;

import ro.ase.cts.lazy.Hotel;

public class Main {
    public static void main(String[] args) {
        Hotel hotel1 = Hotel.getInstance("Hotel Caro", 2, 4);
        Hotel hotel2 = Hotel.getInstance("Hotel Rendezvous", 6, 20);

        hotel1.afisareInchiriereCamera();
        hotel1.afisareInchiriereCamera();

        hotel2.afisareInchiriereCamera();
        hotel2.afisareInchiriereCamera();

    }
}
