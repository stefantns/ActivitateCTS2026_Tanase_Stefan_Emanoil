package ro.ase.cts.clase;

public interface AbstractSearchingFilter {
    SearchingFilter build();
    AbstractSearchingFilter setTitle(String title);
    AbstractSearchingFilter setGen(String gen);
    AbstractSearchingFilter setAnAparitie(int an);
    AbstractSearchingFilter setActori(String actori);
    AbstractSearchingFilter setRating(double rating);
    AbstractSearchingFilter setRegizor(String regizor);
}
