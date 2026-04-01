package ro.ase.cts.clase;

public class RezervareBuilder implements AbstractRezervareBuilder {
    private String numeClient;
    private boolean asezareLaGeam;
    private boolean scauneErgonomice;
    private boolean decorareMasa;
    private boolean muzicaAmbientala;
    private String genMuzica;

    public RezervareBuilder() {
        asezareLaGeam = false;
        scauneErgonomice = false;
        decorareMasa = false;
        muzicaAmbientala = false;
    }

    @Override
    public Rezervare build(String numeClient) {
        return new Rezervare(numeClient, asezareLaGeam, scauneErgonomice, decorareMasa, muzicaAmbientala, genMuzica);
    }

    @Override
    public AbstractRezervareBuilder setAsezareLaGeam(boolean bool) {
        this.asezareLaGeam = bool;
        return this;
    }

    @Override
    public AbstractRezervareBuilder setScauneErgonomice(boolean bool) {
        this.scauneErgonomice = bool;
        return this;
    }

    @Override
    public AbstractRezervareBuilder setDecorareMasa(boolean bool) {
        this.decorareMasa = bool;
        return this;
    }

    @Override
    public AbstractRezervareBuilder setMuzicaAmbientala(boolean bool) {
        this.muzicaAmbientala = bool;
        return this;
    }

    @Override
    public AbstractRezervareBuilder setGenMuzica(String gen) {
        this.genMuzica = gen;
        return this;
    }
}
