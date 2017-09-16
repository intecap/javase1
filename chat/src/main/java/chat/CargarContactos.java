package chat;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CargarContactos {

	public static List<Contacto> obtenerContactos() {
		
		List<Contacto> contactos = new ArrayList<Contacto>();

		try {
			Scanner sc = new Scanner(new File("contactos.in"));
			while(sc.hasNextLine()) {
				String line = sc.nextLine();
				
				String[] tokens = line.split(":");
				String nombre = tokens[0].trim();
				String ip = tokens[1].trim();
				
				Contacto contacto = new Contacto();
				contacto.setNombre(nombre);
				contacto.setIp(ip);
				
				contactos.add(contacto);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		return contactos;

	}
}
