package ro.ase.cts.clase;

import java.util.HashMap;
import java.util.Map;

public class LinieFactory {
    public Map<Integer, LinieDeTransport> linii = new HashMap<>();

    public LinieDeTransport getLinie(int nrLinie, String primaStatie, String ultimaStatie){
        if(!linii.containsKey(nrLinie)){
            linii.put(nrLinie,new Linie(nrLinie ,primaStatie, ultimaStatie));
        }
        return linii.get(nrLinie);
    }
}
