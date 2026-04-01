package ro.ase.cts.main;

import ro.ase.cts.clase.*;

public class Main {
    public static void main(String[] args) {
        AbstractMembership membership = Membership.getInstance();
        ((Membership)membership).setPretMembership(25.9);
        membership.creeazaAbonament();
        System.out.println(membership.toString());

        Thread t = new Thread(() -> {
            Membership m2 = Membership.getInstance();
            System.out.println(m2.toString());
        });
        t.start();

        AbstractSearchingFilter builder = new SearchingFilterBuilder();
        SearchingFilter filter = builder.setActori("Cotabita").setAnAparitie(1234).setTitle("titlu").build();
        System.out.println(filter.toString());

    }
}
