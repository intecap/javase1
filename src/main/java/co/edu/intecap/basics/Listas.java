package co.edu.intecap.basics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Listas {

	private List<Integer> numeros = new ArrayList<>();

	public Listas() {
		crearLista();
		mostrarLista();
		buscar(67);
	}

	private void buscar(int num) {
		
		System.out.println(Collections.binarySearch(numeros, num));
//		for (int i = 0; i < numeros.size(); i++) {
//			if (numeros.get(i).intValue() == num) {
//				System.out.println("Encontre el " + 
//						num + "en la posicion " + i);
//				break;
//			}else {
//				//System.out.println("No encontre el numero");
//			}
//		}
	}

	public static void main(String[] args) {
		new Listas();
	}

	public void crearLista() {

		for (int i = 0; i < 100; i++) {
			double aleatorio = Math.random() * 100 + 1;
			numeros.add((int) aleatorio);
		}
		Collections.sort(numeros);
	}

	public void mostrarLista() {
		for (Integer num : numeros) {
			System.out.print(num + " ");

		}
		System.out.println();
	}

}
