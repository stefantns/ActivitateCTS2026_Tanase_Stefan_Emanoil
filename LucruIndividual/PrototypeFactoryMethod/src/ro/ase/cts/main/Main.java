package ro.ase.cts.main;

import ro.ase.cts.clase.Event;
import ro.ase.cts.clase.TransmisiuneLive;
import ro.ase.cts.clase.Webinar;
import ro.ase.cts.enums.TipIntalnire;
import ro.ase.cts.fabrici.FabricaEvent;
import ro.ase.cts.fabrici.FabricaIntalnire;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        FabricaEvent fabricaEvent = new FabricaIntalnire();
        Event webinar = fabricaEvent.creareIntalnire(TipIntalnire.WEBINARONLINE, "Webinar", "12.12.2001");
        webinar.broadcast();
        Event workshop = fabricaEvent.creareIntalnire(TipIntalnire.WORKSHOP, "workshop", "11.12.2003");
        workshop.broadcast();
        Event conferinta = fabricaEvent.creareIntalnire(TipIntalnire.CONFERINTA, "conferinta", " 11.11.2024");
        conferinta.broadcast();

        List<String> comentarii = new ArrayList<>();
        comentarii.add("Comentariu1");
        comentarii.add("Comentariu2");

        Webinar webinar1 = new TransmisiuneLive("titlu", "descriere", comentarii);
        System.out.println(webinar1.toString());
        webinar1.addComment("Noapte buna");
        System.out.println(webinar1.toString());
        Webinar webinar2 = ((TransmisiuneLive) webinar1).copiaza();
        System.out.println(webinar2);
        webinar2.addComment("Level 1");
        System.out.println(webinar2);
    }
}
