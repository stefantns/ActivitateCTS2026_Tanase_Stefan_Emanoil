package ro.ase.cts.main;

import ro.ase.cts.clase.*;

public class Main {
    public static void main(String[] args) {
        PersonalSpital medic = new Medic("Stefan");
        PersonalSpital asistenta = new Asistenta("RazvanMergeLaTabla");

        Pacient pacient1 = new Pacient("Andrei");
        Pacient pacient2 = new Pacient("Georgescu");
        Pacient pacient3 = new Pacient("Mihalcea");

        Comanda internare = new Internare(medic, pacient1);
        Comanda tratare = new Tratare(asistenta, pacient2);

        Operator operator = new Operator();
        operator.inregistreaza(internare);
        operator.inregistreaza(tratare);
        operator.executaFISA();
        operator.inregistreaza(new Tratare(asistenta, pacient3));
        operator.executaFISA();
        operator.executaFISA();
    }
}
