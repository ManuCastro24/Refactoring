package Refactoring;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		var sc = new Scanner(System.in);

		String frase;

		System.out.print("Introduce una frase : ");
		frase = sc.nextLine();

		System.out.print("El numero de espacios que tiene es : " + numeroDeEspacios(frase));

	}

	public static int numeroDeEspacios(String f) {
		int Espacios = 0;

		for (int i = 0; i < f.length(); i++) {
			if (f.charAt(i) == ' ') {
				Espacios++;

			}
		}

		return Espacios;
	}

}
