package ejercicios;

import java.util.Arrays;
import java.util.Scanner;

public class Ej3 {
	/*
	 * Realiza un programa que pida 10 números por teclado y que los almacene en un
	 * array. Seguidamente, el programa pasará los números primos a las primeras
	 * posiciones, desplazando el resto de números (los que no son primos) a las
	 * últimas posiciones, de tal forma que no se pierda ninguno. Al final se debe
	 * mostrar el array resultante.
	 */
	public static void main(String[] args) {

		boolean primo;
		int numero;
		int tabla[] = new int[10];
		int primos[];
		int contPrimos = 0;

		Scanner lee = new Scanner(System.in);

		System.out.println("Por favor introduzca 10 numeros separados por enter: ");

		for (int i = 0; i < tabla.length; i++) {
			tabla[i] = lee.nextInt();
		}
		
		// Recorremos la tabla
		for (int i = 0; i < tabla.length; i++) {
			// comprobamos si el numero es primo con la funcion esPrimo
			primo = esPrimo(tabla[i]);
			if (primo == true) {
				contPrimos++; //Se incrementara el contador de los primos y nos dará el tamaño de la tabla "primos[]"
			}
		}
		primos = new int[contPrimos];//Ahora la tabla tiene el tamaño de los numeros primos que se hayan introducido
		
		//Con este for tengo que llenar la tabla primo con los numeros primos de la tabla original
		for(int i=0;i<tabla.length;i++) {
			if (tabla[i]
		}
		System.arraycopy(primos, 0, tabla, 0, primos.length);
		System.out.println(Arrays.toString(tabla));
	}

	static boolean esPrimo(int n) {
		for (int i = 2; i < n; i++) {
			if (n % i == 0)
				return false;
		}
		return true;
	}
}
