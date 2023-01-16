package ejercicios;

import java.util.Arrays;
import java.util.Scanner;

public class Ej7 {
	/*
	 * Crea un programa que cree un array de 10 enteros y luego muestre el siguiente
	 * menú con distintas opciones: Mostrar valores. Introducir valor. Salir.
	 */
	public static void main(String[] args) {
		int numUser;
		int tabla[] = new int[10];
		int opcionUser;
		boolean salida = true;// Variable para administrar la opcion de salida
		Scanner lee = new Scanner(System.in);

		do {
		System.out.println("Elija la opcion que prefiera: ");
		System.out.println("1: Mostrar valores" + "\n" + "2: Introducir valor" + "\n" + "3: Salir");
		System.out.print("Introduzca su opcion: ");
		opcionUser = lee.nextInt();
		
			
			switch (opcionUser) {

			case 1:
				System.out.println(Arrays.toString(tabla));
				
				break;

			case 2:
				System.out.println("Por favor introduzca los valores que desee.");
				for (int i = 0; i < tabla.length; i++) {
					numUser = lee.nextInt();
				} // fin for
				
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
		while (salida == false);
	}// fin del main

}
