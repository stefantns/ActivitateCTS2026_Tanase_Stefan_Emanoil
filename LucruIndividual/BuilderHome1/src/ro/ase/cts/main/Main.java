package ro.ase.cts.main;

import ro.ase.cts.clase.AbstractHolidayPackage;
import ro.ase.cts.clase.HolidayPackage;
import ro.ase.cts.clase.HolidayPackageBuilder;

public class Main {
    public static void main(String[] args) {
        AbstractHolidayPackage builder = new HolidayPackageBuilder();
        builder.setActivitati(true);
        HolidayPackage holidayPackage1 = builder.setActivitati(true).setActivitati(true).build();
        System.out.println(holidayPackage1);
    }
}
