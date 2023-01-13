package ejercicios;

import java.util.Scanner;

public class Ej4 {
	/*
	 * Escribir un programa que lea 10 valores enteros por teclado y los almacene en
	 * una tabla (tablaEnteros). A continuación, debes construir una tabla que
	 * contenga los mismos elementos que tablaEnteros pero sin repetir. Usa el
	 * algoritmo de búsqueda explicado en los apuntes.
	 */
	public static void main(String[] args) {

		int tablaEnteros[] = new int[10];
		int tablaDesordenada[] = new int[tablaEnteros.length];
		Scanner lee = new Scanner(System.in);

		System.out.println("Introduzca numeros separados por enter: ");
		for (int i = 0; i < tablaEnteros.length; i++) {// Aqui estoy llenando la tabla
			tablaEnteros[i] = lee.nextInt();
		}
		

		
	}//Fin del MAIN

}
