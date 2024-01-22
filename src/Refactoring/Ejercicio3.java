package Refactoring;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		var sc = new Scanner(System.in);

		String frase;

		System.out.print("Introduce una frase : ");
		frase = sc.nextLine();

		tipoDeCaracter(frase);

	}

	public static void tipoDeCaracter(String frase) {
		int PosicionDelCaracter = 0;

		if (frase.length() / 2 == 0) {
			PosicionDelCaracter = (frase.length() / 2) - 1;

		} else {
			PosicionDelCaracter = (frase.length() / 2);
		}

		char caracter = frase.charAt(PosicionDelCaracter);

		if (caracter == ' ') {
			System.out.print("Es un espacio");

		}

		if (caracter != ' ') {
			System.out.print("No es un espacio");
		}
	}

}
