package ro.ase.cts.main;

import ro.ase.cts.clase.Abonament;
import ro.ase.cts.clase.AbonamentBuilder;
import ro.ase.cts.clase.AbstractAbonamentBuilder;

public class Main {
    public static void main(String[] args) {
        AbstractAbonamentBuilder builder1 = new AbonamentBuilder();
        Abonament abonament1 =  builder1.setTipAbonament("Student").setReducereStudent(true).build("Stefan");
        System.out.println(abonament1.toString());

        AbstractAbonamentBuilder builder2 = new AbonamentBuilder();
        Abonament abonament2 = builder2.setTipAbonament("Normal").setAccesMetrou(true).setAccesAutobuz(true).setReducereStudent(false).build("Gigel");
        System.out.println(abonament2.toString());
    }
}
