package ro.ase.cts.clase;

public abstract class PublicatieDigitala implements Publicatie{
    private String nume;
    private String autor;
    private double dimensiune;

    public PublicatieDigitala(String nume, String autor, double dimensiune) {
        this.nume = nume;
        this.autor = autor;
        this.dimensiune = dimensiune;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("nume='").append(nume).append('\'');
        sb.append(", autor='").append(autor).append('\'');
        sb.append(", dimensiune=").append(dimensiune);
        return sb.toString();
    }
}
