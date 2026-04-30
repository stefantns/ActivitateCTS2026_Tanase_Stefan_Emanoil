package ro.ase.cts.clase;

public class AutobuzDeNoapte implements MijlocDeTransport{
    private MijlocDeTransport autobuz;

    public AutobuzDeNoapte(MijlocDeTransport autobuz) {
        this.autobuz = autobuz;
    }

    @Override
    public int getNrCalatori() {
        return autobuz.getNrCalatori();
    }

    @Override
    public String getLinie() {
        return autobuz.getLinie();
    }

    @Override
    public void opresteInStatie() {
        if(autobuz.getNrCalatori() > 0){
            autobuz.opresteInStatie();
        }
        else {
            System.out.println("Autobuzul se retrage.");
        }
    }
}
