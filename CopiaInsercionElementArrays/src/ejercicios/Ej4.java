
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
		int posBuscada;//esta variable es para guardar la busqueda del binary search
		Scanner lee = new Scanner(System.in);

		System.out.println("Introduzca numeros separados por enter: ");
		for (int i = 0; i < tablaEnteros.length; i++) {// Aqui estoy llenando la tabla
			tablaEnteros[i] = lee.nextInt();
		}
		
		Arrays.sort(tablaEnteros);//La ordeno para luego usar el binary search
		
		for(int i=0; i<tablaEnteros.length; i++) {//recorro la tabla de donde quiero sacar los elementos
			posBuscada =Arrays.binarySearch (tablaSinRepetidos, tablaEnteros[i]);//en la tabla vacia buscaré la "i"(el elemento en el que este el for)
			
			if(posBuscada<0) {//si el resultado de la busqueda es menor a 0 entonces(significa que no esta)
				tablaSinRepetidos = Arrays.copyOf(tablaSinRepetidos, tablaSinRepetidos.length+1);//usare el metodo de insercion
				//que es la tabla en la que quiero insertar el elemento, utilizando un array copyOf
			//copio la tabla y la copia tendra una posicion mas(esta es la insercion ordenada)
			
				//para añadir el elemento lo hago en la ultima posicion, y el elemento añadido será el que no enté en la tabla principial(Eso quiere decir tablaEnteros[i])
				tablaSinRepetidos[tablaSinRepetidos.length-1] = tablaEnteros[i];
			}
			
		}//fin del for
		System.out.println(Arrays.toString(tablaSinRepetidos));

	}// Fin del MAIN

}
