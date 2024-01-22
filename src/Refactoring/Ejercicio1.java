package Refactoring;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		var sc = new Scanner(System.in);

		String palabra1, palabra2;

		System.out.println("Introduce la primera palabra : ");
		palabra1 = sc.nextLine();

		System.out.println("Introduce la segunda palabra : ");
		palabra2 = sc.nextLine();

		System.out.print("La palabra mas corta es: " + palabraMasCorta(palabra1, palabra2));

	}

	public static String palabraMasCorta(String palabra1, String palabra2) {
		String corta = "";

		if (palabra1.length() < palabra2.length()) {
			corta = corta.concat(palabra1);

		} else {
			corta = corta.concat(palabra2);

		}

		return corta;

	}

}
