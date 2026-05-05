package ro.ase.cts.clase;

import java.util.ArrayList;
import java.util.List;

public class Operator {
    private List<Comanda> listaComenzi = new ArrayList<>();

    public void inregistreaza(Comanda comanda){
        listaComenzi.add(comanda);
    }

    public void executaFISA(){
        if(!listaComenzi.isEmpty()){
            this.listaComenzi.getFirst().executa();
            this.listaComenzi.removeFirst();
        }
    }
}
