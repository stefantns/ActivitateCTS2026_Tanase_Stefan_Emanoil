package ro.ase.cts.main;

import ro.ase.cts.builder01.AbstractBuilder;
import ro.ase.cts.builder01.Internare;
import ro.ase.cts.builder01.InternareBuilder;
import ro.ase.cts.builder02.AbstractBuilder02;
import ro.ase.cts.builder02.Internare02;
import ro.ase.cts.builder02.InternareBuilder02;

public class Main {
    public static void main(String[] args) {
        Internare internare1 = new Internare();
        internare1.setNumePacient("Georgel Vasilescu");
        internare1.setPatRabatabil(true);

        Internare internare2 = new Internare();
        internare2.setNumePacient("Mascarpone Mafioso");
        internare2.setPatRabatabil(true);


        AbstractBuilder builder = new InternareBuilder("Georgica");

        Internare internare3 = builder.setPatRabatabil(true).build();
        Internare internare4 = builder.setPapuciCamera(true).setNume("Mariusica").build();
        System.out.println(internare3.toString());
        System.out.println(internare4.toString());

        AbstractBuilder02 builder2 = new InternareBuilder02();
        builder.setMicDejunInclus(true);
        Internare02 internare5 = builder2.build("Georgelus");
        Internare02 internare6 = builder2.build("Gigelus");

        System.out.println(internare5.toString());
        System.out.println(internare6.toString());

        internare5.setHalat(true);
    }
}
