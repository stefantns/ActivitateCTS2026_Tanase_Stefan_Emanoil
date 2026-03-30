package ro.ase.cts.clase;

public class HolidayPackageBuilder implements AbstractHolidayPackage{
    private boolean hasTransport;
    private boolean hasCazare;
    private boolean hasActivitati;

    public HolidayPackageBuilder() {
        this.hasActivitati = false;
        this.hasCazare = false;
        this.hasTransport = false;
    }

    @Override
    public HolidayPackage build() {
        return new HolidayPackage(hasTransport, hasCazare, hasActivitati);
    }

    @Override
    public AbstractHolidayPackage setTransport(boolean bool) {
        this.hasTransport = bool;
        return this;
    }

    @Override
    public AbstractHolidayPackage setCazare(boolean bool) {
        this.hasCazare = bool;
        return this;
    }

    @Override
    public AbstractHolidayPackage setActivitati(boolean bool) {
        this.hasActivitati = bool;
        return this;
    }
}
