package Refactoring;

import java.util.Scanner;

public class Ejercicio5 {

	private static void main(String[] args) {



		var sc = new Scanner(System.in);
		
		
		
		System.out.print("Por favor, introduzca un número entero positivo: ");
		int numero = sc.nextInt();
		
		System.out.print("Introduzca la posición a partir de la cual quiere partir el número: ");
		int posicion = sc.nextInt();
		
		
		String Numero = String.valueOf(numero);
		
		separaNumero(Numero, posicion);
		sc.close();
		
	}

	
	private static void  separaNumero(String num , int partir) {
		
		
		String resultado =  num.substring(0, partir-1) + " " + num.substring(partir-1); 
	
		System.out.println(resultado);
		
	}

}
