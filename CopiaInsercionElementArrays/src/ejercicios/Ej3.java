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

		int tabla[] = new int[10]; // Tabla con los numeros ingresados por el usuario
		int primo[]; // Tabla de numeros primos
		int noPrimo[]; // Tabla de numero NO primos
		int contPrimo = 0; // Contador de numeros primos de la tabla Original
		int contNoPrimos = 0; // Contador de numeros no primos de la tabla Original
		int indPrimo = 0; // Indice de la tabla de numeros primos
		int indNoPrimo = 0; // Indice de la tabla de numeros NO primos

		Scanner lee = new Scanner(System.in);

		System.out.println("Por favor introduzca 10 numeros separados por enter: ");
		
		for (int i = 0; i < tabla.length; i++) {//Recorro la tabla y leo los numeros para llenarla
			tabla[i] = lee.nextInt();
			
			if (esPrimo(tabla[i])) { //Verifico si es primo y en caso de que si el contador se incrementa
				contPrimo++;
			}//Fin del if

			else {
				contNoPrimos++; //en caso contrario se incrementa el contador de los NO primos
			}//Fin del else
		}//Fin de for

		primo = new int[contPrimo]; //Tabla de numeros primos del tamaño de contador
		noPrimo = new int[contNoPrimos];//Tabla de numeros NO primos del tamaño de contador

		for (int i = 0; i < tabla.length; i++) {//Este for verifica si es primo o no y en caso de que si lo guarda en la tabla primo
			
			if (esPrimo(tabla[i])) {
				primo[indPrimo] = tabla[i];//El indPrimo sirve para que se guarde el la posicion correcta de la tabla
				indPrimo++;//Se va incrementando el indice 
			} // fin if
			
			else {
				noPrimo[indNoPrimo] = tabla[i];
				indNoPrimo++;
			}
		} // Fin for
		
		/*
		System.out.println("Tabla Primos: " + Arrays.toString(primo));
		System.out.println("Tabla NO Primos: " + Arrays.toString(noPrimo));
		 */
		
		System.arraycopy(primo, 0, tabla, 0, primo.length); //Aqui se copia la posicion 0 de la tabla primo a la posicion 0 de la tabla original
		//La longitud es la logitud de la tabla primo
		
		
		System.arraycopy(noPrimo,0,tabla,primo.length,noPrimo.length);//En este caso se copia la tabla NOprimo desde el indice 0
		//A la tabla Original, desde la posicion ultima del tamaño de la tabla primo, y la longitud es la de la tabla noPrimo

		//Tabla ordenada

		System.out.println(Arrays.toString(tabla));
	
	}// fin main

	static boolean esPrimo(int n) {
		for (int i = 2; i < n; i++) {
			if (n % i == 0)
				return false;
		}
		return true;
	}
}
