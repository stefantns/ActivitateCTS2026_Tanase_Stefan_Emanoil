package ro.ase.cts.clase;

public interface AbstractHolidayPackage {
    HolidayPackage build();
    AbstractHolidayPackage setTransport(boolean bool);
    AbstractHolidayPackage setCazare(boolean bool);
    AbstractHolidayPackage setActivitati(boolean bool);
}
