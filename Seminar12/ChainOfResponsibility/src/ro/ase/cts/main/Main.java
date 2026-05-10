package ro.ase.cts.main;

import ro.ase.cts.clase.*;

public class Main {
    public static void main(String[] args) {
        CalatorieHandler calatorieAutobuz = new CalatorieAutobuz();
        CalatorieHandler calatorieMetrou = new CalatorieMetrou();
        CalatorieHandler calatorieTramvai = new CalatorieTramvai();
        CalatorieHandler calatorieTroleibuz = new CalatorieTroleibuz();

        calatorieAutobuz.setCalatorieHandler(calatorieTroleibuz);
        calatorieTroleibuz.setCalatorieHandler(calatorieTramvai);
        calatorieTramvai.setCalatorieHandler(calatorieMetrou);

        System.out.println(calatorieAutobuz.recomandaCalatorie(7));
        System.out.println(calatorieAutobuz.recomandaCalatorie(4));
        System.out.println(calatorieAutobuz.recomandaCalatorie(15));
    }
}
