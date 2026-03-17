package ro.ase.cts.builder02;


import ro.ase.cts.builder01.Internare;

public interface AbstractBuilder02 {
    Internare build(String nume);
    AbstractBuilder02 setPatRabatabil(boolean bool);
    AbstractBuilder02 setMicDejunInclus(boolean bool);
    AbstractBuilder02 setPapuciCamera(boolean bool);
    AbstractBuilder02 setHalat(boolean bool);
}
