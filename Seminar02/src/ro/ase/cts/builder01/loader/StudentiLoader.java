package ro.ase.cts.builder01.loader;

import ro.ase.cts.builder01.Aplicant;
import ro.ase.cts.builder01.Student;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentiLoader extends AplicantiLoader{
    @Override
    public List<Aplicant> load(String file) throws FileNotFoundException {
        Scanner input = new Scanner(new File(file));
        input.useDelimiter(",|\n");
        List<Aplicant> studenti = new ArrayList<Aplicant>();

        while (input.hasNext()) {
            Student student = new Student();
            loadAplicantData(input, student);
            int an_studii = input.nextInt();
            String facultate = (input.next()).toString();
            student.setAnStudii(an_studii);
            student.setFacultate(facultate);
            studenti.add(student);
        }
        input.close();
        return studenti;
    }
}
