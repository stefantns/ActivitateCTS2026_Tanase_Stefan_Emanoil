package ro.ase.cts.clase;

public class AbonamentBuilder implements AbstractAbonamentBuilder{
    private String numeCalator;
    private String tipAbonament;
    private boolean accesMetrou;
    private boolean accesTramvai;
    private boolean accesAutobuz;
    private boolean accesTroleibuz;
    private boolean reducereStudent;

    public AbonamentBuilder() {
        accesMetrou = false;
        accesAutobuz = false;
        accesTramvai = false;
        accesTroleibuz = false;
        reducereStudent = false;
    }

    @Override
    public Abonament build(String numeCalator) {
        return new Abonament(numeCalator, tipAbonament, accesMetrou,accesTramvai, accesAutobuz, accesTroleibuz, reducereStudent);
    }

    @Override
    public AbstractAbonamentBuilder setAccesMetrou(boolean bool) {
        this.accesMetrou = bool;
        return this;
    }

    @Override
    public AbstractAbonamentBuilder setAccesTramvai(boolean bool) {
        this.accesTramvai = bool;
        return this;
    }

    @Override
    public AbstractAbonamentBuilder setAccesTroleibuz(boolean bool) {
        this.accesTroleibuz = bool;
        return this;
    }

    @Override
    public AbstractAbonamentBuilder setAccesAutobuz(boolean bool) {
        this.accesAutobuz = bool;
        return this;
    }

    @Override
    public AbstractAbonamentBuilder setReducereStudent(boolean bool) {
        this.reducereStudent = bool;
        return this;
    }

    @Override
    public AbstractAbonamentBuilder setTipAbonament(String tip) {
        this.tipAbonament = tip;
        return this;
    }
}
