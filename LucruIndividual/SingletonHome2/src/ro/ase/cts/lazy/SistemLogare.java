package ro.ase.cts.lazy;

public class SistemLogare {
    private String numeFisier;
    private int numarInregistrari;
    private String dataUltimeiInregistrari;

    private SistemLogare(String numeFisier, int numarInregistrari, String dataUltimeiInregistrari) {
        this.numeFisier = numeFisier;
        this.numarInregistrari = numarInregistrari;
        this.dataUltimeiInregistrari = dataUltimeiInregistrari;
    }

    public void afisareDescriere(){
        StringBuilder sb = new StringBuilder();
        sb.append(numeFisier).append(" ");
        sb.append(numarInregistrari).append(" ");
        sb.append(dataUltimeiInregistrari).append(" ");
        System.out.println(sb.toString());
    }

    private static SistemLogare instanta = null;

    public static synchronized SistemLogare getInstance(String nume, int numar, String data){
        if(instanta == null) {
            instanta = new SistemLogare(nume, numar, data);
        }
        return instanta;
    }
}
