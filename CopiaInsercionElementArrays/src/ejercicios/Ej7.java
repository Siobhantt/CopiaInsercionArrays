package ejercicios;

import java.util.Arrays;
import java.util.Scanner;

public class Ej7 {
	/*
	 * Crea un programa que cree un array de 10 enteros y luego muestre el siguiente
	 * menú con distintas opciones: Mostrar valores. Introducir valor. Salir.
	 */
	/*La opción ‘a’ mostrará todos los valores por pantalla. 
	 * La opción ‘b’ pedirá un valor V y una posición P, luego escribirá V en la posición P del array. 
	 * El menú se repetirá indefinidamente hasta que el usuario elija la opción ‘c’ que terminará el programa*/
	public static void main(String[] args) {
		int valor;
		int posicion;
		int numUser;
		int tabla[] = new int[10];
		int opcionUser;
		boolean salida = false;// Variable para administrar la opcion de salida
		Scanner lee = new Scanner(System.in);

		do {
			
		System.out.println("Elija la opcion que prefiera: ");
		System.out.println("1: Mostrar valores" + "\n" + "2: Introducir valor" + "\n" + "3: Salir");
		System.out.print("Introduzca su opcion: ");
		opcionUser = lee.nextInt();
		System.out.println();
		
			switch (opcionUser) {

			case 1:
				System.out.println(Arrays.toString(tabla));
				
				break;

			case 2:
				System.out.println("Por favor introduzca una posicion: ");
				posicion = lee.nextInt();
				System.out.println("Por favor introduzca un valor: ");
				valor=lee.nextInt();
				
			tabla[posicion]= valor;
				
			
				break;

			case 3:
				salida = true;
				break;

			default:
				System.out.println("Opcion no valida.");
				;
				break;
			}// fin del switch
		} // fin del DO
		while (!salida);
	}// fin del main

}
