package ro.ase.cts.builder01;


public class InternareBuilder implements AbstractBuilder {
    private Internare internare;

    public InternareBuilder(String nume) {
        this.internare = new Internare(nume, false, false, false, false);
    }

    @Override
    public Internare build() {
        return this.internare;
    }

    @Override
    public AbstractBuilder setNume(String nume) {
        this.internare.setNumePacient(nume);
        return this;
    }

    @Override
    public AbstractBuilder setPatRabatabil(boolean bool) {
        this.internare.setPatRabatabil(bool);
        return this;
    }

    @Override
    public AbstractBuilder setMicDejunInclus(boolean bool) {
        this.internare.setMicDejunInclus(bool);
        return this;
    }

    @Override
    public AbstractBuilder setPapuciCamera(boolean bool) {
        this.internare.setPapuciCamera(bool);
        return this;
    }

    @Override
    public AbstractBuilder setHalat(boolean bool) {
        this.internare.setHalat(bool);
        return this;
    }
}
