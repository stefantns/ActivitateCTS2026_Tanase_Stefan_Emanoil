package ro.ase.cts.clase;

public interface AbstractMasaBuilder {
    Masa build(int nrMasa);
    AbstractMasaBuilder setLocLaTerasa(boolean bool);
    AbstractMasaBuilder setLumanari(boolean bool);
    AbstractMasaBuilder setFataDeMasaPremium(boolean bool);
}
