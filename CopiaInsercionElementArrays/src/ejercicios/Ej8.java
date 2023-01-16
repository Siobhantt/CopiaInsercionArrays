package ejercicios;

import java.util.Scanner;

public class Ej8 {
	/*Crea un programa que permita al usuario almacenar una secuencia aritmética en un array y luego mostrarla. 
	 * Una secuencia aritmética es una serie de números que comienza por un valor inicial V, y continúa con incrementos de I. 
	 * Por ejemplo, con V=1 e I=2, la secuencia sería 1, 3, 5, 7, 9… Con V=7 e I=10, la secuencia sería 7, 17, 27, 37…
	 *  El programa solicitará al usuario el valor inicial V, el incremento I y el número de valores a crear N.*/
	public static void main(String[] args) {
		int valorI;
		int incremento;
		int cantValores;
		int secuencia[]= new int[cantValores];
		int vacio[]=new int[0];

Scanner lee = new Scanner(System.in);
		
		System.out.println("Introduzca el valor inicial: ");
		valorI= lee.nextInt();
		
		System.out.println("Introduzca el incremento que desee: ");
		incremento = lee.nextInt();
		
		System.out.println("Introduzca la cantdad de valores que desee generar: ");
		cantValores=lee.nextInt();
		
		
		for(int i=0; i<secuencia.length;i++) {
			secuencia[i] =valorI;
		incremento= valorI+incremento;
		
		}
	}

}
