package co.edu.intecap.basics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Control {

	public static void main(String[] args) throws IOException {
		// Capturar dato
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader reader = new BufferedReader(isr);
		System.out.print("Digita un numero: _");
		Integer num = 0;
		try {
			num = Integer.parseInt(reader.readLine());
		} catch (NumberFormatException e) {
			System.out.println("valor invalido ingresado...");
		}
		// Validar par

		System.out.println((num % 2 == 0) ? "El numero [" + num + "] es PAR" : "El numero [" + num + "] es IMPAR");

		// Constants constant = Constants.ADULTO;
		//
		// switch (constant) {
		// case ADOLESCENTE:
		// System.out.println("Es un adolescente");
		// break;
		// case ADULTO:
		// System.out.println("Es un adulto");
		// break;
		// case JOVEN:
		// System.out.println("Es un joven");
		// break;
		// default:
		// break;
		//
		// }
	}

}
