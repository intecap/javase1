package co.edu.intecap.basics;

public abstract class Animal {
	protected String name;
	protected String sex;
	protected String age;

	protected void feed(String food) {
		System.out.println(name + " is eating " + food);
	}
	
	protected void sleep() {
		// Do nothing
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
}
