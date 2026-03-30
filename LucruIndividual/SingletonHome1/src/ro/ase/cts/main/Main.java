package ro.ase.cts.main;

import ro.ase.cts.lazy.SistemGestiuneComenzi;

public class Main {
    public static void main(String[] args) {
        SistemGestiuneComenzi sistem = SistemGestiuneComenzi.getInstance("StefanEating", 2, 200);
        SistemGestiuneComenzi sistem1 = SistemGestiuneComenzi.getInstance("MercedesRestaurant", 0, 0 );
        sistem.afisareStare();
        sistem1.afisareStare();
    }
}
