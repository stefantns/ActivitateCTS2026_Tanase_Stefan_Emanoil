package ro.ase.cts.clase;

public class ComandaBuilder implements AbstractComandaBuilder {
    private String numeClient;
    private int nrMasa;
    private boolean supaInclusa;
    private boolean desertInclus;
    private boolean bauturaInclusa;
    private boolean portieMare;
    private boolean sosExtra;
    private String tipSos;

    public ComandaBuilder() {
        this.supaInclusa = false;
        this.desertInclus = false;
        this.bauturaInclusa = false;
        this.portieMare = false;
        this.sosExtra = false;
    }

    @Override
    public Comanda build(String numeClient, int nrMasa) {
        return new Comanda(numeClient, nrMasa, supaInclusa, desertInclus, bauturaInclusa, portieMare, sosExtra, tipSos);
    }

    @Override
    public AbstractComandaBuilder setSupaInclusa(boolean bool) {
        this.supaInclusa = bool;
        return this;
    }

    @Override
    public AbstractComandaBuilder setDesertInclus(boolean bool) {
        this.desertInclus = bool;
        return this;
    }

    @Override
    public AbstractComandaBuilder setBauturaInclusa(boolean bool) {
        this.bauturaInclusa = bool;
        return this;
    }

    @Override
    public AbstractComandaBuilder setPortieMare(boolean bool) {
        this.portieMare = bool;
        return this;
    }

    @Override
    public AbstractComandaBuilder setSosExtra(boolean bool) {
        this.sosExtra = bool;
        return this;
    }

    @Override
    public AbstractComandaBuilder setTipSos(String tipSos) {
        this.tipSos = tipSos;
        return this;
    }
}
