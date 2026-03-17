package ro.ase.cts.builder02;


public interface AbstractBuilder02 {
    Internare02 build(String nume);
    AbstractBuilder02 setPatRabatabil(boolean bool);
    AbstractBuilder02 setMicDejunInclus(boolean bool);
    AbstractBuilder02 setPapuciCamera(boolean bool);
    AbstractBuilder02 setHalat(boolean bool);
}
