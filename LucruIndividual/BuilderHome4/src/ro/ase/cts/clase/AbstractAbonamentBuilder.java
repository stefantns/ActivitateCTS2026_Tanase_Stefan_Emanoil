package ro.ase.cts.clase;

public interface AbstractAbonamentBuilder {
    Abonament build(String numeCalator);
    AbstractAbonamentBuilder setAccesMetrou(boolean bool);
    AbstractAbonamentBuilder setAccesTramvai(boolean bool);
    AbstractAbonamentBuilder setAccesTroleibuz(boolean bool);
    AbstractAbonamentBuilder setAccesAutobuz(boolean bool);
    AbstractAbonamentBuilder setReducereStudent(boolean bool);
    AbstractAbonamentBuilder setTipAbonament(String tip);
}
