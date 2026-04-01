package ro.ase.cts.clase;

public class SearchingFilter{
    private String titlu;
    private String gen;
    private int anAparitie;
    private String actori;
    private double rating;
    private String regizor;

    public SearchingFilter(String titlu, String gen, int anAparitie, String actori, double rating, String regizor) {
        this.titlu = titlu;
        this.gen = gen;
        this.anAparitie = anAparitie;
        this.actori = actori;
        this.rating = rating;
        this.regizor = regizor;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("SearchingFilter{");
        sb.append("titlu='").append(titlu).append('\'');
        sb.append(", gen='").append(gen).append('\'');
        sb.append(", anAparitie=").append(anAparitie);
        sb.append(", actori='").append(actori).append('\'');
        sb.append(", rating=").append(rating);
        sb.append(", regizor='").append(regizor).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
