package ro.ase.cts.main;

import ro.ase.cts.clase.ContClient;
import ro.ase.cts.clase.PrototypeContClient;

public class Main {
    public static void main(String[] args) {
        PrototypeContClient contClient = new ContClient("Stefan", "0787654", "stefanlol21@yahoo.com", "weiner");
        PrototypeContClient contClientCopiat = contClient.copiaza();
        System.out.println(contClient);
        System.out.println(contClientCopiat);

        ((ContClient) contClientCopiat).setAdresa("stefan cel mare nr 12");
        System.out.println(contClientCopiat);
        System.out.println(contClient);
    }
}
