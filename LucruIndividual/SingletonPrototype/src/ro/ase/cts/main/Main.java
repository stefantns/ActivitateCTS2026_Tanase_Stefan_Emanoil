package ro.ase.cts.main;

import ro.ase.cts.clase.AutonomousDriving;
import ro.ase.cts.clase.PrototypeAutonomousDriving;

public class Main {
    public static void main(String[] args) {
        PrototypeAutonomousDriving chatgpt = AutonomousDriving.getInstance();
        ((AutonomousDriving)chatgpt).setPremium(true);
        ((AutonomousDriving)chatgpt).setVersuneAI("Mihiata");
        System.out.println(chatgpt.toString());
        PrototypeAutonomousDriving claude = AutonomousDriving.getInstance();
        ((AutonomousDriving)claude).setPremium(false);
        System.out.println(claude.toString());
        System.out.println(chatgpt.toString());
    }
}
