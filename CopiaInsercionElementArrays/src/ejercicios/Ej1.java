package ejercicios;

import java.util.Arrays;
import java.util.Scanner;

public class Ej1 {
	/*
	 * Escribe un programa que lea 15 números por teclado y que los almacene en un
	 * array. Rota los elementos de ese array, es decir, el elemento de la posición
	 * 0 debe pasar a la posición 1, el de la 1 a la 2, etc. El número que se
	 * encuentra en la última posición debe pasar a la posición 0. Finalmente,
	 * muestra el contenido del array.
	 */
	public static void main(String[] args) {

		int numUser;
		Scanner lee = new Scanner(System.in);

		int tabla[] = new int[15];
		int tabla2[] = new int[15];
		System.out.println("Por favor introduzca 15 numeros separados por enter:");
/*Este for es para rellenar el array*/
		for (int i = 0; i < tabla.length; i++) {
			numUser = lee.nextInt();
			tabla[i] = numUser;
		}
		/*Aqui se copia la tabla desde la posicion 0,   */
		/*Copia una cantidad de elementos, no el numero de las posiciones*/
		System.arraycopy(tabla, 0, tabla2, 1, tabla.length - 1);

		tabla2[0] = tabla[tabla.length - 1];

		System.out.println("La tabla introducida es: " + Arrays.toString(tabla));

		System.out.println("El resultado de la tabla modificada es: " + Arrays.toString(tabla2));
	}
}
