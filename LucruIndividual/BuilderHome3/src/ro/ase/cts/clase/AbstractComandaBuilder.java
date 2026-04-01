package ro.ase.cts.clase;

public interface AbstractComandaBuilder {
    Comanda build(String numeClient, int nrMasa);
    AbstractComandaBuilder setSupaInclusa(boolean bool);
    AbstractComandaBuilder setDesertInclus(boolean bool);
    AbstractComandaBuilder setBauturaInclusa(boolean bool);
    AbstractComandaBuilder setPortieMare(boolean bool);
    AbstractComandaBuilder setSosExtra(boolean bool);
    AbstractComandaBuilder setTipSos(String tipSos);
}
