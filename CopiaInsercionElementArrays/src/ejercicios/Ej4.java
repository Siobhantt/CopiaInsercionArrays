package ejercicios;

import java.util.Arrays;
import java.util.Scanner;

public class Ej4 {
	/*
	 * Escribir un programa que lea 10 valores enteros por teclado y los almacene en
	 * una tabla (tablaEnteros). A continuación, debes construir una tabla que
	 * contenga los mismos elementos que tablaEnteros pero sin repetir. Usa el
	 * algoritmo de búsqueda explicado en los apuntes.
	 */
	public static void main(String[] args) {

		int posicion;
		int tablaEnteros[] = new int[10];
		int tablaSinRepetir[] = new int[10];
		Scanner lee = new Scanner(System.in);

		for (int i = 0; i < tablaEnteros.length; i++) {// con este for lleno la tabla de los numeros introducidos por el
														// usuario
			tablaEnteros[i] = lee.nextInt();
		}

		for (int i=0; i<tablaEnteros.length;i++) {
			posicion = Arrays.binarySearch(tablaEnteros, )	
		}

		
	}// fin del main

}