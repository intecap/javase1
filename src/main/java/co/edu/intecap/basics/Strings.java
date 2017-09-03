package co.edu.intecap.basics;

public class Strings {

	public static void main(String[] args) {
		String saludo = new String("Hola");
		String ext = "mundo!";
		String complete = saludo + ext;
		System.out.println(complete);
		System.out.println(saludo.charAt(1));
		
		long val1 = 3l;
		int val2 = 5;
		long res = val1+val2;
		System.out.println(res);
		
		double  floatval1 = 3.1f;
		float floatval2 = 2.1f;
		double result = floatval1 * floatval2;
		
		System.out.println(result);
		
		
		Cat cat1 = new Cat("Gatuela", "HEMBRA", "2");
		Cat cat2 = new Cat("Gatuela", "MACHO", "3");
		
		System.out.println("Cat1"+cat1);
		System.out.println("Cat2"+cat2);
		System.out.println(cat1 == cat2);
		System.out.println(cat1.equals(cat2));
		
		
				
	}

}
