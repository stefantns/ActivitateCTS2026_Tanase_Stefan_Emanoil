package ro.ase.cts.main;

import java.io.FileNotFoundException;
import java.util.List;

import ro.ase.cts.builder01.Aplicant;
import ro.ase.cts.builder01.loader.AngajatiLoader;
import ro.ase.cts.builder01.loader.AplicantiLoader;



public class Program {

	public static void main(String[] args) {
		List<Aplicant> listaAngajati;
		AplicantiLoader angajatLoader = new AngajatiLoader();
		try {
			listaAngajati = angajatLoader.load("angajati.txt");
			for(Aplicant angajat:listaAngajati) {
				System.out.println(angajat.toString());
				angajat.afisareFinantare();
				angajat.afisareStatut();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
