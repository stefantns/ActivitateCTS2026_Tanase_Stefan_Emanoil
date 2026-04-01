package ro.ase.cts.clase;

public class Masa {
    private int nrMasa;
    private boolean locLaTerasa;
    private boolean lumanari;
    private boolean fataDeMasaPremium;

    public Masa() {
    }

    public Masa(int nrMasa, boolean locLaTerasa, boolean lumanari, boolean fataDeMasaPremium) {
        this.nrMasa = nrMasa;
        this.locLaTerasa = locLaTerasa;
        this.lumanari = lumanari;
        this.fataDeMasaPremium = fataDeMasaPremium;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Masa{");
        sb.append("nrMasa=").append(nrMasa);
        sb.append(", locLaTerasa=").append(locLaTerasa);
        sb.append(", lumanari=").append(lumanari);
        sb.append(", fataDeMasaPremium=").append(fataDeMasaPremium);
        sb.append('}');
        return sb.toString();
    }
}
