package ro.ase.cts.clase.decorator;

import ro.ase.cts.clase.NotaDePlataAbstract;

public class NotaDePlata1Mai extends ro.ase.cts.clase.decorator.NotaDePlataDecorator {
    public NotaDePlata1Mai(NotaDePlataAbstract notaDePlata) {
        super(notaDePlata);
    }

    @Override
    public void printeazaFelicitare() {
        System.out.println("La multi ani de 1 mai");
    }
}
