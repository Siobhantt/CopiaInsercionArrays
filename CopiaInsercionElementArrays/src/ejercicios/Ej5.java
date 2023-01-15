package ejercicios;

import java.util.Arrays;
import java.util.Scanner;

public class Ej5 {
	/*
	 * Escribir un programa que lea 10 valores enteros por teclado y los almacene en
	 * una tabla (tablaEnteros). A continuación, debes crear dos tablas: numPares y
	 * numImpares. En numPares almacenarás los números pares que se encuentren en
	 * tablaEnteros y en numImpares almacenarás los números impares.
	 */
	public static void main(String[] args) {

		int numP[] = new int[10];// tabla de pares
		int numImpares[] = new int[10];// tabla de impares
		int numUser;// Donde guardaremos lo que introducirá el usuario
		int indicePar = 0;// Indice de la tabla par
		int indiceImp = 0;// Indice de la tabla impar
		Scanner lee = new Scanner(System.in);

		System.out.println("Por favor introduzca un numero: ");

		for (int i = 0; i < 10; i++) {
			numUser = lee.nextInt();

			if (numUser % 2 == 0) {// comprobamos si es par
				numP[indicePar++] = numUser;// en caso de que si lo guardamos en la tabla par
				// y como no tenemos otro bucle dentro incrementamos la variable que corresponde
				// al indice de la tabla par
				
			} // fin del if
			
			else {
				numImpares[indiceImp++] = numUser;// lo mismo pero con los numeros impares
			} // fin del else
		} // fin del for

		System.out.println("Tabla de numeros pares: " + Arrays.toString(numP));
		System.out.println("Tabla de numeros impares: " +Arrays.toString(numImpares));
	}

}
