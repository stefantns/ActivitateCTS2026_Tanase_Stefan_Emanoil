package ro.ase.cts.clase;

public interface AbstractRezervareBuilder {
    Rezervare build(String numeClient);
    AbstractRezervareBuilder setAsezareLaGeam(boolean bool);
    AbstractRezervareBuilder setScauneErgonomice(boolean bool);
    AbstractRezervareBuilder setDecorareMasa(boolean bool);
    AbstractRezervareBuilder setMuzicaAmbientala(boolean bool);
    AbstractRezervareBuilder setGenMuzica(String gen);
}
