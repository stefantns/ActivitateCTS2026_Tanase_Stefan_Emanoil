package ro.ase.cts.clase;

public class Comanda {
    private String numeClient;
    private int nrMasa;
    private boolean supaInclusa;
    private boolean desertInclus;
    private boolean bauturaInclusa;
    private boolean portieMare;
    private boolean sosExtra;
    private String tipSos;

    public Comanda(String numeClient, int nrMasa, boolean supaInclusa, boolean desertInclus, boolean bauturaInclusa, boolean portieMare, boolean sosExtra, String tipSos) {
        this.numeClient = numeClient;
        this.nrMasa = nrMasa;
        this.supaInclusa = supaInclusa;
        this.desertInclus = desertInclus;
        this.bauturaInclusa = bauturaInclusa;
        this.portieMare = portieMare;
        this.sosExtra = sosExtra;
        this.tipSos = tipSos;
    }

    public void setNumeClient(String numeClient) {
        this.numeClient = numeClient;
    }

    public void setNrMasa(int nrMasa) {
        this.nrMasa = nrMasa;
    }

    public void setSupaInclusa(boolean supaInclusa) {
        this.supaInclusa = supaInclusa;
    }

    public void setDesertInclus(boolean desertInclus) {
        this.desertInclus = desertInclus;
    }

    public void setBauturaInclusa(boolean bauturaInclusa) {
        this.bauturaInclusa = bauturaInclusa;
    }

    public void setPortieMare(boolean portieMare) {
        this.portieMare = portieMare;
    }

    public void setSosExtra(boolean sosExtra) {
        this.sosExtra = sosExtra;
    }

    public void setTipSos(String tipSos) {
        this.tipSos = tipSos;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Comanda{");
        sb.append("numeClient='").append(numeClient).append('\'');
        sb.append(", nrMasa=").append(nrMasa);
        sb.append(", supaInclusa=").append(supaInclusa);
        sb.append(", desertInclus=").append(desertInclus);
        sb.append(", bauturaInclusa=").append(bauturaInclusa);
        sb.append(", portieMare=").append(portieMare);
        sb.append(", sosExtra=").append(sosExtra);
        sb.append(", tipSos='").append(tipSos).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
