package Refactoring;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		var sc = new Scanner(System.in);
		
		String frase;
		
		System.out.print("Introduce una frase : ");
		frase = sc.nextLine();
		
		NumeroDeEspacios(frase);
		
		System.out.print("El numero de espacios que tiene es : " + NumeroDeEspacios(frase));
		
		
	}

	public static int NumeroDeEspacios(String f) {
		
		int Espacios = 0;
		
		for(int i = 0; i < f.length(); i++){
			
			if (f.charAt(i) == ' ') {
				
				Espacios++;
				
			}
		}
		
		return Espacios;
	}

}
