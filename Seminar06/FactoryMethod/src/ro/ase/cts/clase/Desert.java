package ro.ase.cts.clase;

public abstract class Desert implements FelDeMancare{
    private int calorii;
    private double pret;
    private int gramaj;

    public Desert(int calorii, double pret, int gramaj) {
        this.calorii = calorii;
        this.pret = pret;
        this.gramaj = gramaj;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("calorii=").append(calorii);
        sb.append(", pret=").append(pret);
        sb.append(", gramaj=").append(gramaj);
        return sb.toString();
    }
}
