
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

		int tablaEnteros[] = new int[10];
		int tablaSinRepetidos[] = new int[0];
		int posBuscada;
		Scanner lee = new Scanner(System.in);

		System.out.println("Introduzca numeros separados por enter: ");
		for (int i = 0; i < tablaEnteros.length; i++) {// Aqui estoy llenando la tabla
			tablaEnteros[i] = lee.nextInt();
		}
		
		Arrays.sort(tablaEnteros);
		
		for(int i=0; i<tablaEnteros.length; i++) {
			posBuscada =Arrays.binarySearch (tablaSinRepetidos, tablaEnteros[i]);
			
			if(posBuscada<0) {
				tablaSinRepetidos = Arrays.copyOf(tablaSinRepetidos, tablaSinRepetidos.length+1);
			tablaSinRepetidos[tablaSinRepetidos.length-1] = tablaEnteros[i];
			}
			
		}
		

	}// Fin del MAIN

}
