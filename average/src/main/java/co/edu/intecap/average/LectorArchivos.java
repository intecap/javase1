package co.edu.intecap.average;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

public class LectorArchivos {

	private String path = "alumnos.in";

	public void validatePath() {
		File file = new File(path);
		boolean exists = file.exists();
		System.out.println(exists ? "OK" : "NOT FOUND");
	}

	public List<Student> readFile() {
		
		List<Student> students = new ArrayList<>();
		
		File file = new File(path);
		try {
			Scanner sc = new Scanner(file);
			while (sc.hasNextLine()) {
				String line = sc.nextLine();
				Student student = readStudent(line);
				students.add(student);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		return students;
	}

	private Student readStudent(String line) {
		StringTokenizer st = new StringTokenizer(line, ";");

		String name = st.nextToken().trim();
		Float grade1 = Float.parseFloat(st.nextToken().trim());
		Float grade2 = Float.parseFloat(st.nextToken().trim());
		Float grade3 = Float.parseFloat(st.nextToken().trim());
		Float grade4 = Float.parseFloat(st.nextToken().trim());
		Float grade5 = Float.parseFloat(st.nextToken().trim());
		Student student = new Student(name, grade1, grade2, grade3, grade4, grade5);
		
		return student;
	}
}
