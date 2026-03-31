package ro.ase.cts.clase;

public class TourismLicense implements AbstractTourismLicense{
    private String licenseNumber;
    private String data;
    private boolean licenseModificata = false;

    private TourismLicense(String licenseNumber, String data) {
        this.licenseNumber = licenseNumber;
        this.data = data;
    }

    private static TourismLicense instanta = null;

    public static synchronized TourismLicense getInstance(String licenseNumber, String data){
        if(instanta == null){
            instanta = new TourismLicense(licenseNumber, data);
        }
        return instanta;
    }

    @Override
    public void setLicenseNumber(String numar) throws Exception{
        if(!licenseModificata){
            this.licenseNumber = numar;
            this.licenseModificata = true;
        }
        else throw new Exception("Nu se poate modifica seria licentei");
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("licenseNumber='").append(licenseNumber).append('\'');
        sb.append(", data='").append(data).append('\'');
        sb.append(", licenseModificata=").append(licenseModificata);
        return sb.toString();
    }
}
