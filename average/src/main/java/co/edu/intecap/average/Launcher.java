package co.edu.intecap.average;

public class Launcher {

	public static void main(String[] args) {
		LectorArchivos lector = new LectorArchivos();
		lector.validatePath();
		
		EscritorArchivo escritor = new EscritorArchivo(lector.readFile());
		escritor.imprimirReporte();
	}

}
