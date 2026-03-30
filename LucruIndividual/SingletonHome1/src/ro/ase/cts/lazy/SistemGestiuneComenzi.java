package ro.ase.cts.lazy;

public class SistemGestiuneComenzi {
    private String numeRestaurant;
    private int numarComenziActive;
    private double sumaIncasata;

    public void adaugaComanda(int nrComenziNoi) {
        numarComenziActive = numarComenziActive + nrComenziNoi;
    }

    public void marcheazaPlata(double suma) {
        numarComenziActive--;
        sumaIncasata += suma;
    }

    public void afisareStare() {
        StringBuilder sb = new StringBuilder();
        sb.append(numeRestaurant).append(" ");
        sb.append(numarComenziActive).append(" ");
        sb.append(sumaIncasata).append(" ");
        System.out.println(sb.toString());
    }

    private SistemGestiuneComenzi(String numeRestaurant, int numarComenziActive, double sumaIncasata) {
        this.numeRestaurant = numeRestaurant;
        this.numarComenziActive = numarComenziActive;
        this.sumaIncasata = sumaIncasata;
    }

    private static SistemGestiuneComenzi instanta = null;

    public static synchronized SistemGestiuneComenzi getInstance(String nume, int nrComenzi, double suma) {
        if (instanta == null) {
            instanta = new SistemGestiuneComenzi(nume, nrComenzi, suma);
        }
        return instanta;
    }
}
