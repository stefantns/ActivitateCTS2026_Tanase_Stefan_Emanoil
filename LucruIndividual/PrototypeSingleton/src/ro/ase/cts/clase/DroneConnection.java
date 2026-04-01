package ro.ase.cts.clase;

public class DroneConnection implements IDroneConnection {
    private String ip;

    private DroneConnection() {
    }

    public DroneConnection(String ip) {
        this.ip = ip;
    }

    private static DroneConnection instanta = null;

    public static synchronized DroneConnection getInstance(){
        if (instanta == null){
            instanta = new DroneConnection();
        }
        return instanta;
    }

    @Override
    public void setIp(String ip) {
        this.ip = ip;
    }

    @Override
    public void afisareDescriere() {
        StringBuilder sb = new StringBuilder("Conexiunea cu ip: ");
        sb.append(this.ip);
//        System.out.println("Conexiunea cu ip: " + this.ip);
        System.out.println(sb.toString());
    }
}
