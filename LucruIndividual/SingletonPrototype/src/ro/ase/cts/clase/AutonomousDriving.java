package ro.ase.cts.clase;

public class AutonomousDriving implements PrototypeAutonomousDriving{
    private String versuneAI;
    private boolean premium;

    private AutonomousDriving(){}


    private static AutonomousDriving instanta = null;

    public static synchronized AutonomousDriving getInstance(){
        if (instanta == null){
            instanta = new AutonomousDriving();
        }
        return instanta;
    }


    public AutonomousDriving(String versuneAI, boolean premium) {
        this.versuneAI = versuneAI;
        this.premium = premium;
    }

    public void setVersuneAI(String versuneAI) {
        this.versuneAI = versuneAI;
    }

    public void setPremium(boolean premium) {
        this.premium = premium;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("AutonomousDriving{");
        sb.append("versuneAI='").append(versuneAI).append('\'');
        sb.append(", premium=").append(premium);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public PrototypeAutonomousDriving copiaza() {
        AutonomousDriving autonomousDriving = new AutonomousDriving();
        autonomousDriving.premium = this.premium;
        autonomousDriving.versuneAI = this.versuneAI;
        return autonomousDriving;
    }
}
