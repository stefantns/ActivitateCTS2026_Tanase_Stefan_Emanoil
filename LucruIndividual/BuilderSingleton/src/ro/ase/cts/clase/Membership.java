package ro.ase.cts.clase;

public class Membership implements AbstractMembership{
    private double pretMembership;

    private Membership(){}

    private static Membership instance = null;

    public static synchronized Membership getInstance(){
        if (instance == null){
            instance = new Membership();
        }
        return instance;
    }

    public void setPretMembership(double pretMembership) {
        this.pretMembership = pretMembership;
    }

    @Override
    public void creeazaAbonament() {
        System.out.println("Abonamentul a fost creat si costa " + this.pretMembership);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Membership{");
        sb.append("pretMembership=").append(pretMembership);
        sb.append('}');
        return sb.toString();
    }
}
