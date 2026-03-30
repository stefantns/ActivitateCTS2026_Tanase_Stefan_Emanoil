package ro.ase.cts.clase;

public class HolidayPackage {
    private boolean hasTransport;
    private boolean hasCazare;
    private boolean hasActivitati;

    public HolidayPackage(boolean hasTransport, boolean hasCazare, boolean hasActivitati) {
        this.hasTransport = hasTransport;
        this.hasCazare = hasCazare;
        this.hasActivitati = hasActivitati;
    }

    public boolean isHasTransport() {
        return hasTransport;
    }

    public void setHasTransport(boolean hasTransport) {
        this.hasTransport = hasTransport;
    }

    public boolean isHasCazare() {
        return hasCazare;
    }

    public void setHasCazare(boolean hasCazare) {
        this.hasCazare = hasCazare;
    }

    public boolean isHasActivitati() {
        return hasActivitati;
    }

    public void setHasActivitati(boolean hasActivitati) {
        this.hasActivitati = hasActivitati;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("HolidayPackage{");
        sb.append("hasTransport=").append(hasTransport);
        sb.append(", hasCazare=").append(hasCazare);
        sb.append(", hasActivitati=").append(hasActivitati);
        sb.append('}');
        return sb.toString();
    }
}
