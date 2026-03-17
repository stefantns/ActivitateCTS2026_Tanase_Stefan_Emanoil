package ro.ase.cts.main;

import ro.ase.cts.builder01.AbstractBuilder;
import ro.ase.cts.builder01.Internare;
import ro.ase.cts.builder01.InternareBuilder;

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
    }
}
