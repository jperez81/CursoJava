package Estructuras;

import java.util.*;

/*
 * Ejercicio :
 * Adivina el numero aleatorio y ver la cantidad de intentos
 *
 */
public class Adivina_Numero {

	public static void main(String[] args) {
		int aleatorio = (int) (Math.random() * 100);
		@SuppressWarnings("resource")
		Scanner entrada = new Scanner(System.in);
		int numero = 0;
		int intentos = 0;

		while (numero != aleatorio) {
			intentos++;

			System.out.println("Introduce un  numero por favor: ");
			numero = entrada.nextInt();

			if (aleatorio < numero) {
				System.out.println("Introduce un numero mas bajo: ");
			} else if (aleatorio > numero) {
				System.out.println("Introcude un numero mas alto: ");
			}

		}
		System.out.println("Correcto el numero es :" + aleatorio);
		System.out.println("Lo adivinaste en " +intentos+ " intentos.");
	}

}
