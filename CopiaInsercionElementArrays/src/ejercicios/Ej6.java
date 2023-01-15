package ejercicios;

import java.util.Arrays;

public class Ej6 {
/*Crea un programa que cree dos arrays de enteros de tamaño 100. 
 * Luego introducirá en el primer array todos los valores del 1 al 100. 
 * Por último, deberá copiar todos los valores del primer array al segundo array en orden inverso, y mostrar ambos por pantalla.
*/
	public static void main(String[] args) {
		int numero1=1;//para llenar la primera tabla
		int numero2=1;//para llenar la segunda tabla
		int alReves[]= new int[100];
		int recto[] = new int[100];
		int temp;//Variable temporal
		
		for(int i=0; i<alReves.length;i++) {
			alReves[i]=numero1++;
			recto[i]=numero2++;
		}
		
		for (int i = 0; i < alReves.length / 2; i++) {//aqui se le da la vuelta al array partiendo la tabla por la mitad
			//e intercambiando el primero por el ultimo y asi susesivamente
		    temp = alReves[i];//igualamos la variable temporal al indice de la tabla alReves
		    alReves[i] = alReves[alReves.length - i - 1];//luego el indice de la tabla al reves lo igualamos al ultimo elemento
		    alReves[alReves.length - i - 1] = temp;//y el ultimo elemento se iguala al primero
		}
		
		System.out.println(Arrays.toString(recto));
		System.out.println(Arrays.toString(alReves));
	}

}
