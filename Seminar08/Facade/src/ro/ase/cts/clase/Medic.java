package ro.ase.cts.clase;

public class Medic {
    public boolean areInregistratPacientul(ro.ase.cts.clase.Pacient pacient) {
        return pacient.getGravitate() > 5;
    }
}
