package ro.ase.cts.clase;

public class MasaBuilder implements AbstractMasaBuilder{
    private int nrMasa;
    private boolean locLaTerasa;
    private boolean lumanari;
    private boolean fataDeMasaPremium;

    public MasaBuilder() {
        nrMasa = 0;
        locLaTerasa = false;
        lumanari = false;
        fataDeMasaPremium = false;
    }

    @Override
    public Masa build(int nrMasa) {
        return new Masa(nrMasa, locLaTerasa, lumanari, fataDeMasaPremium);
    }

    @Override
    public AbstractMasaBuilder setLocLaTerasa(boolean bool) {
        this.locLaTerasa = bool;
        return this;
    }

    @Override
    public AbstractMasaBuilder setLumanari(boolean bool) {
        this.lumanari = bool;
        return this;
    }

    @Override
    public AbstractMasaBuilder setFataDeMasaPremium(boolean bool) {
        this.fataDeMasaPremium = bool;
        return this;
    }
}
