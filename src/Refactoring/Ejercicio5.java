package Refactoring;

import java.util.Scanner;

public class Ejercicio5 {

	private static void main(String[] args) {
		// TODO Auto-generated method stub


		var sc = new Scanner(System.in);
		
		int numero,posicion;
		
		System.out.print("Por favor, introduzca un número entero positivo: ");
		numero = sc.nextInt();
		
		System.out.print("Introduzca la posición a partir de la cual quiere partir el número: ");
		posicion = sc.nextInt();
		
		
		String Numero = String.valueOf(numero);
		
		Numpartido(Numero, posicion);
		
		
	}

	
	private static void  Numpartido(String num , int partir) {
		
		
		String resultado =  num.substring(0, partir-1) + " " + num.substring(partir-1); 
	
		System.out.println(resultado);
		
	}

}
