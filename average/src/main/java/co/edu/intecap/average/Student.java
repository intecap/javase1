package co.edu.intecap.average;

import java.util.ArrayList;
import java.util.List;

public class Student implements Comparable<Student> {

	private String name;
	private List<Float> grades;
	private Float average;

	public Student(String name, Float n1, Float n2, Float n3, Float n4, Float n5) {
		this.name = name;
		grades = new ArrayList<>();
		grades.add(n1);
		grades.add(n2);
		grades.add(n3);
		grades.add(n4);
		grades.add(n5);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Float> getGrades() {
		return grades;
	}

	public void setGrades(List<Float> grades) {
		this.grades = grades;
	}

	public Float getAverage() {
		this.average = 0f;
		for (Float grade : grades) {
			this.average += grade;
		}
		this.average = this.average / grades.size();
		return this.average;
	}

	public void setAverage(Float average) {
		this.average = average;
	}

	@Override
	public int compareTo(Student o) {
		return this.getAverage().compareTo(o.getAverage());
	}

}
