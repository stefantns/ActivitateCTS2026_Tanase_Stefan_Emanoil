package ro.ase.cts.fabrici;

import ro.ase.cts.clase.*;
import ro.ase.cts.enums.TipEvent;
import ro.ase.cts.enums.TipIntalnire;

public class FabricaIntalnire implements FabricaEvent {
    public Event creareIntalnire(TipIntalnire tip, String title, String data) {
        return switch (tip) {
            case TipIntalnire.CONFERINTA -> new Conferinta(title, data);
            case TipIntalnire.WORKSHOP -> new Workshop(title, data);
            case TipIntalnire.WEBINARONLINE -> new WebinarOnline(title, data);
            default -> null;
        };
    }
}
