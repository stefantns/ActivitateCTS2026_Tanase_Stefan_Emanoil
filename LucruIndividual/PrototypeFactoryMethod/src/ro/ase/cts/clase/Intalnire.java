package ro.ase.cts.clase;

public abstract class Intalnire implements Event {
    private String title;
    private String data;

    public Intalnire(String title, String data) {
        this.title = title;
        this.data = data;
    }

    public String getData() {
        return data;
    }

    @Override
    public String getTitle() {
        return this.title;
    }

    @Override
    public void setTitle(String title) {
    }

}
