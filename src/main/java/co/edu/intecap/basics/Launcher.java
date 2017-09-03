package co.edu.intecap.basics;

public class Launcher {

	public static void main(String[] args) {
		
		System.out.println(Integer.MAX_VALUE);
		
		boolean b = Boolean.FALSE;
		
		Integer i = 1;
		System.out.println(i);
		
		
		Animal perro = new Dog("Firulais","MACHO","2");
		Animal gato = new Cat("Princesa","HEMBRA","3");
		perro.sleep();
		gato.sleep();
		
		System.out.println("Dog name: "+ perro.getName());
		System.out.println("Cat name: "+ gato.getName());
	}

}
