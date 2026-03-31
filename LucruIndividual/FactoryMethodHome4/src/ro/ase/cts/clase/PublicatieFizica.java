package ro.ase.cts.clase;

public abstract class PublicatieFizica implements Publicatie{
    private String nume;
    private String autor;
    private int numarPagini;

    public PublicatieFizica(String nume, String autor, int numarPagini) {
        this.nume = nume;
        this.autor = autor;
        this.numarPagini = numarPagini;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("nume='").append(nume).append('\'');
        sb.append(", autor='").append(autor).append('\'');
        sb.append(", numarPagini=").append(numarPagini);
        return sb.toString();
    }
}
