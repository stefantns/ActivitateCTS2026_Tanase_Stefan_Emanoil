package ro.ase.cts.clase.spital;

public class Medicament {
    private String nume;
    private double pret;

    public String getNume() {
        return nume;
    }

    public Medicament(String nume, double pret) {
        this.nume = nume;
        this.pret = pret;
    }

    public void achizitioneazaMedicament() {
        if(prezintaReteta()) {
            System.out.println("Este achizitionat medicamentul " + this.nume + " la pretul de " + this.pret);
        } else {
            System.out.println("Pentru medicamentul " + this.nume + " este nevoie de reteta.");
        }
    }

    private boolean prezintaReteta() {
        return nume.contains("reteta");
    }
}
