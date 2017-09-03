package co.edu.intecap.basics;

public class Dog extends Animal implements Comparable<Dog>{

	public Dog(String name, String sex, String age) {
		this.name = name;
		this.sex = sex;
		this.age = age;
	}
	
	@Override
	public void sleep() {
		super.sleep();
		System.out.println("Dog is sleeping");
	}

	@Override
	public int compareTo(Dog o) {
		if(o.name.equals(this.name)) {
			return 0;
		}
		else {
			return this.name.compareTo(o.name);
		}
	}

	

}
