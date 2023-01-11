package ejercicios;

import java.util.Arrays;

public class Ej2 {
	/*
	 * Escribe un programa que genere 20 números enteros aleatorios entre 0 y 100 y
	 * que los almacene en un array. El programa debe ser capaz de pasar todos los
	 * números pares a las primeras posiciones del array (del 0 en adelante) y todos
	 * los números impares a las celdas restantes. Utiliza arrays auxiliares si es
	 * necesario.
	 */
	public static void main(String[] args) {

		int tabla[] = new int[20];
		int contP = 0; //Contador pares
		int contImp = 0; //Contador impares
		int pares[]; //Tabla pares
		int impares[]; //Tabla impares
		int indPar = 0; //Indice pares
		int indImpar = 0; //indice impares

		// Con este for genero los 20 numeros aleatorios
		for (int i = 0; i < tabla.length; i++) {
			tabla[i] = (int) (Math.random() * 100 + 1);
			// En caso de que el elemento del indice sea par lo guardo en el contador
			// correspondiente
			if (tabla[i] % 2 == 0) {

				contP++;
			} else {// Lo mismo con los impares
				contImp++;
			}
		}
		
		// Prueba para verificar la cantidad de pares e impares
		System.out.println("Pares: " + contP);
		System.out.println("Impares: " + contImp);
		
		//Imprimo la tabla 
		System.out.println("Tabla actual: " + Arrays.toString(tabla));
		
		//Le doy el tamaño a las tablas
		pares = new int[contP];

		impares = new int[contImp];

		// Para rellenar las tablas con los pares e impares
		for (int i = 0; i < tabla.length; i++) {

			if (tabla[i] % 2 == 0) {
				pares[indPar] = tabla[i];// Tuve que crear un indice para que se vaya colocando en la posicion correcta
											// de la tabla 
				indPar++;
			} else {
				impares[indImpar] = tabla[i];
				indImpar++;
			}
		}
		System.out.println();
		System.out.println("Tabla pares" + Arrays.toString(pares));
		System.out.println();
		System.out.println("Tabla impares" + Arrays.toString(impares));
		System.out.println();
		// Arriba ya estan las tablas llenas
		
		//Aqui abajo he copiado de la tabla par desde el indice 0, a la tabla original desde el indice 0, y la longitud entera de la tabla pares
		System.arraycopy(pares, 0, tabla, 0, pares.length);

		//Lo mismo con la tabla "impares"
		System.arraycopy(impares, 0, tabla, pares.length, impares.length);

		//La tabla ordenada
		System.out.println("Tabla ordenada: " + Arrays.toString(tabla));
	}

}
