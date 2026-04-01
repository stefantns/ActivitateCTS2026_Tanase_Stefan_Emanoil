package ro.ase.cts.clase;

public class ContClient implements PrototypeContClient {
    private String nume;
    private String nrTelefon;
    private String email;
    private String adresa;

    private ContClient() {
    }

    public ContClient(String nume, String nrTelefon, String email, String adresa) {
        if (nume.length() > 0) {
            this.nume = nume;
        }
        if (nrTelefon.length() > 0 && nrTelefon.length() < 11) {
            this.nrTelefon = nrTelefon;
        }
        if (email.length() > 0 && !email.isBlank()) {
            this.email = email;
        }
        if (adresa.length() > 0 && !adresa.isBlank()) {
            this.adresa = adresa;
        }
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setAdresa(String adresa) {
        this.adresa = adresa;
    }

    @Override
    public PrototypeContClient copiaza() {
        ContClient clientNou = new ContClient();
        clientNou.nume = this.nume;
        clientNou.nrTelefon = this.nrTelefon;
        clientNou.email = this.email;
        clientNou.adresa = this.adresa;
        return clientNou;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("nume='").append(nume).append('\'');
        sb.append(", nrTelefon='").append(nrTelefon).append('\'');
        sb.append(", email='").append(email).append('\'');
        sb.append(", adresa='").append(adresa).append('\'');
        return sb.toString();
    }
}
