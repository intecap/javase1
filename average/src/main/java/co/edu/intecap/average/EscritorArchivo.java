package co.edu.intecap.average;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Collections;
import java.util.List;

public class EscritorArchivo {

	private List<Student> students;

	public EscritorArchivo(List<Student> students) {
		this.students = students;
	}

	public void imprimirReporte() {

		Collections.sort(students);

		File f = new File("alumnos.out");
		try {
			PrintWriter out = new PrintWriter(f);

			for (Student student : students) {

				out.println(String.format("%-16s :%.2f", student.getName(), 
						student.getAverage()));
			}
			out.flush();
			out.close();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
