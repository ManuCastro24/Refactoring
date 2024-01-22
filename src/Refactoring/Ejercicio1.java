package Refactoring;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		var sc = new Scanner(System.in);
		
		String palabra1,palabra2;
		
		System.out.println("Introduce la primera palabra : ");
		palabra1 = sc.nextLine();
		
		System.out.println("Introduce la segunda palabra : ");
		palabra2 = sc.nextLine();
		
		Palabramascorta(palabra1,palabra2);
		
		System.out.print("La palabra mas corta es: " + Palabramascorta(palabra1,palabra2));
		
	}

	
	private static String Palabramascorta(String p1, String p2) {
		
		String corta = "";
		
		if (p1.length() < p2.length()) {
			
			corta = corta.concat(p1);
		
		}else {
			
			corta = corta.concat(p2);
			
		}
		
		return corta;
		
	}

}
