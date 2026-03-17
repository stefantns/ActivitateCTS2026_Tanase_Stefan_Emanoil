package ro.ase.cts.builder01;



public interface AbstractBuilder {
    Internare build();
    AbstractBuilder setNume(String nume);
    AbstractBuilder setPatRabatabil(boolean bool);
    AbstractBuilder setMicDejunInclus(boolean bool);
    AbstractBuilder setPapuciCamera(boolean bool);
    AbstractBuilder setHalat(boolean bool);
}
