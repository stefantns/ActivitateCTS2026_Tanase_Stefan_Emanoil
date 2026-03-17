package ro.ase.cts.builder02;

public class InternareBuilder02 implements AbstractBuilder02 {

    private boolean patRabatabil;
    private boolean micDejunInclus;
    private boolean papuciCamera;
    private boolean halat;

    public InternareBuilder02() {
        this.patRabatabil = false;
        this.micDejunInclus = false;
        this.papuciCamera = false;
        this.halat = false;
    }

    @Override
    public Internare02 build(String nume) {
        return new Internare02(nume, patRabatabil, micDejunInclus, papuciCamera, halat);
    }

    @Override
    public AbstractBuilder02 setPatRabatabil(boolean bool) {
        this.patRabatabil = bool;
        return this;
    }

    @Override
    public AbstractBuilder02 setMicDejunInclus(boolean bool) {
        this.micDejunInclus = bool;
        return this;
    }

    @Override
    public AbstractBuilder02 setPapuciCamera(boolean bool) {
        this.papuciCamera = bool;
        return this;
    }

    @Override
    public AbstractBuilder02 setHalat(boolean bool) {
        this.halat = bool;
        return this;
    }
}
