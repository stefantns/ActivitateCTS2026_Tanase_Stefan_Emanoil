package ro.ase.cts.clase;

public class Abonament {
    private String numeCalator;
    private String tipAbonament;
    private boolean accesMetrou;
    private boolean accesTramvai;
    private boolean accesAutobuz;
    private boolean accesTroleibuz;
    private boolean reducereStudent;

    public Abonament(String numeCalator, String tipAbonament, boolean accesMetrou, boolean accesTramvai, boolean accesAutobuz, boolean accesTroleibuz, boolean reducereStudent) {
        this.numeCalator = numeCalator;
        this.tipAbonament = tipAbonament;
        this.accesMetrou = accesMetrou;
        this.accesTramvai = accesTramvai;
        this.accesAutobuz = accesAutobuz;
        this.accesTroleibuz = accesTroleibuz;
        this.reducereStudent = reducereStudent;
    }

    public void setNumeCalator(String numeCalator) {
        this.numeCalator = numeCalator;
    }

    public void setTipAbonament(String tipAbonament) {
        this.tipAbonament = tipAbonament;
    }

    public void setAccesMetrou(boolean accesMetrou) {
        this.accesMetrou = accesMetrou;
    }

    public void setAccesTramvai(boolean accesTramvai) {
        this.accesTramvai = accesTramvai;
    }

    public void setAccesAutobuz(boolean accesAutobuz) {
        this.accesAutobuz = accesAutobuz;
    }

    public void setAccesTroleibuz(boolean accesTroleibuz) {
        this.accesTroleibuz = accesTroleibuz;
    }

    public void setReducereStudent(boolean reducereStudent) {
        this.reducereStudent = reducereStudent;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Abonament{");
        sb.append("numeCalator='").append(numeCalator).append('\'');
        sb.append(", tipAbonament='").append(tipAbonament).append('\'');
        sb.append(", accesMetrou=").append(accesMetrou);
        sb.append(", accesTramvai=").append(accesTramvai);
        sb.append(", accesAutobuz=").append(accesAutobuz);
        sb.append(", accesTroleibuz=").append(accesTroleibuz);
        sb.append(", reducereStudent=").append(reducereStudent);
        sb.append('}');
        return sb.toString();
    }
}
