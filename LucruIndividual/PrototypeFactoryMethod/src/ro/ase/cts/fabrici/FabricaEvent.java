package ro.ase.cts.fabrici;

import ro.ase.cts.clase.*;
import ro.ase.cts.enums.TipEvent;
import ro.ase.cts.enums.TipIntalnire;

public interface FabricaEvent{
    Event creareIntalnire(TipIntalnire tip, String title, String data);
}
