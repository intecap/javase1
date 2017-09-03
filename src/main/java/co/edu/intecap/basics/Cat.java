package co.edu.intecap.basics;

public class Cat extends Animal {
	public Cat(String name, String sex, String age) {
		this.name = name;
		this.sex = sex;
		this.age = age;
	}
	
	@Override
	public void sleep() {
		super.sleep();
		System.out.println("Cat is sleeping");
	}
	
	@Override
	public boolean equals(Object obj) {
		Cat incoming = (Cat)obj;
		if (this.name.equals(incoming.getName())){
			return true;
		}else {
			return false;
		}
	}
}
