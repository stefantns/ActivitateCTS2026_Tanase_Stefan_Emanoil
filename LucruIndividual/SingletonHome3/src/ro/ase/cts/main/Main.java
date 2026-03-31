package ro.ase.cts.main;

import ro.ase.cts.clase.AbstractTourismLicense;
import ro.ase.cts.clase.TourismLicense;

public class Main {
    public static void main(String[] args) throws Exception{
        AbstractTourismLicense licenta1 = TourismLicense.getInstance("miauhau", "22/02/2001");
        AbstractTourismLicense licenta2 = TourismLicense.getInstance("miausomn", "22/02/2022");

        System.out.println(licenta1.toString());

        licenta1.setLicenseNumber("222");
        System.out.println(licenta2.toString());
        System.out.println(licenta1.toString());
        licenta1.setLicenseNumber("noaptebuna");
    }
}
