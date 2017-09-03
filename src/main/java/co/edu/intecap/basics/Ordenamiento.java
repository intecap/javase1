package co.edu.intecap.basics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Ordenamiento {
	
	private List<Dog> perros = new ArrayList<>();
	
	public Ordenamiento() {
		cargarPerros();
		imprimirPerros();
		Collections.sort(perros);
		imprimirPerros();
	}

	public static void main(String[] args) {
		new Ordenamiento();

	}
	
	public void cargarPerros() {
		perros.add(new Dog("Firulais","MACHO","3"));
		perros.add(new Dog("Matias","MACHO","3"));
		perros.add(new Dog("Rambo","MACHO","2"));
		perros.add(new Dog("Lola","HEMBRA","3"));
	}
	
	public void imprimirPerros() {
		for(Dog dog: perros) {
			System.out.println(dog.getName());
		}
	}

}
