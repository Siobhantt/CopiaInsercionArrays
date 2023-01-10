package ejercicios;

import java.util.Scanner;

public class Ej3 {
/*Realiza un programa que pida 10 números por teclado y que los almacene en un array. 
 * Seguidamente, el programa pasará los números primos a las primeras posiciones, 
 * desplazando el resto de números (los que no son primos) a las últimas posiciones, de tal forma que no se pierda ninguno.
 *  Al final se debe mostrar el array resultante.*/
	public static void main(String[] args) {
		
		int numero;
		int tabla[]= new int[10]; 
		Scanner lee = new Scanner(System.in);
		
		System.out.println("Por favor introduzca 10 numeros separados por enter: ");

		for(int i=0;i<tabla.length;i++) {
			tabla[i]= lee.nextInt();
		}
		

	}

}
