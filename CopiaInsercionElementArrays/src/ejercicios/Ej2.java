package ejercicios;

import java.util.Arrays;

public class Ej2 {
/*Escribe un programa que genere 20 números enteros aleatorios entre 0 y 100 y que los almacene en un array.
 *  El programa debe ser capaz de pasar todos los números pares a las primeras posiciones del array (del 0 en adelante) 
 *  y todos los números impares a las celdas restantes. Utiliza arrays auxiliares si es necesario.
*/
	public static void main(String[] args) {
	
		int tabla[] = new int[20];
		
		for (int i=0; i<tabla.length;i++) {
			tabla[i] = (int) (Math.random()*100);
		
			if (tabla[i] %2==0) {
			
				
		}
		}
		
		for (int i=0;i<tabla.length;i++) {
			
		}
		System.out.println(Arrays.toString(tabla));

	}

}
