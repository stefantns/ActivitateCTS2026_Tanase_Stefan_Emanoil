package ro.ase.cts.clase;

public class SearchingFilterBuilder implements AbstractSearchingFilter {
    private String titlu;
    private String gen;
    private int anAparitie;
    private String actori;
    private double rating;
    private String regizor;

    public SearchingFilterBuilder() {
        this.titlu = "standard";
        this.gen = "Standard";
        this.anAparitie = 0;
        this.actori = "Standard";
        this.rating = 0.0;
        this.regizor = "Standard";
    }

    @Override
    public AbstractSearchingFilter setTitle(String title) {
        this.titlu = title;
        return this;
    }

    @Override
    public AbstractSearchingFilter setGen(String gen) {
        this.gen = gen;
        return this;
    }

    @Override
    public AbstractSearchingFilter setAnAparitie(int an) {
        this.anAparitie = an;
        return this;
    }

    @Override
    public AbstractSearchingFilter setActori(String actori) {
        this.actori = actori;
        return this;
    }

    @Override
    public AbstractSearchingFilter setRating(double rating) {
        this.rating = rating;
        return this;
    }

    @Override
    public AbstractSearchingFilter setRegizor(String regizor) {
        this.regizor = regizor;
        return this;
    }

    @Override
    public SearchingFilter build() {
        return new SearchingFilter(titlu, gen, anAparitie, actori, rating, regizor);
    }
}
