package ro.ase.cts.main;

import ro.ase.cts.clase.AutonomousDriving;
import ro.ase.cts.clase.DroneConnection;
import ro.ase.cts.clase.IDroneConnection;
import ro.ase.cts.clase.PrototypeAutonomousDriving;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> decision = new ArrayList<>();
        decision.add("23232");
        decision.add("moaptebuna");

        PrototypeAutonomousDriving driving = new AutonomousDriving("claudiu", true, decision);
        System.out.println(driving.toString());
        PrototypeAutonomousDriving driving2 = driving.copiaza();
        System.out.println(driving2.toString());
        ((AutonomousDriving)driving2).setVersiuneAI("chatgpt");
        System.out.println(driving2.toString());

        IDroneConnection conexiune = DroneConnection.getInstance();
        conexiune.setIp("12.23.234");
        conexiune.afisareDescriere();
        IDroneConnection conexiune2 = DroneConnection.getInstance();
        conexiune2.setIp("22.23.24:12307");
        conexiune2.afisareDescriere();
        conexiune.afisareDescriere();
    }
}
