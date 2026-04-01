package ro.ase.cts.clase;

import java.util.ArrayList;
import java.util.List;

public class AutonomousDriving implements PrototypeAutonomousDriving{
    private String versiuneAI;
    private boolean premium;
    private List<String> decisionRules;

    private AutonomousDriving(){}

    public AutonomousDriving(String versiuneAI, boolean premium, List<String> decisionRules) {
        this.versiuneAI = versiuneAI;
        this.premium = premium;
        this.decisionRules = new ArrayList<>(decisionRules);
    }

    public void setVersiuneAI(String versiuneAI) {
        this.versiuneAI = versiuneAI;
    }

    public void setPremium(boolean premium) {
        this.premium = premium;
    }

    public void setDecisionRules(List<String> decisionRules) {
        this.decisionRules = decisionRules;
    }


    @Override
    public PrototypeAutonomousDriving copiaza() {
        AutonomousDriving autonomousDriving = new AutonomousDriving();
        autonomousDriving.setPremium(this.premium);
        autonomousDriving.setVersiuneAI(this.versiuneAI);
        autonomousDriving.setDecisionRules(new ArrayList<>(this.decisionRules));
        return autonomousDriving;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("AutonomousDriving{");
        sb.append("versiuneAI='").append(versiuneAI).append('\'');
        sb.append(", premium=").append(premium);
        sb.append(", decisionRules=").append(decisionRules);
        sb.append('}');
        return sb.toString();
    }
}
