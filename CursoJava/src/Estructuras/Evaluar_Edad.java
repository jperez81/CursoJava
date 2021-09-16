package Estructuras;

import java.util.*;

public class Evaluar_Edad {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner entrada = new Scanner(System.in);
		System.out.println("Favor de indicar tu edad:");

		int edad = entrada.nextInt();

		if (edad < 18) {

			System.out.println("Eres menor");

		} else if (edad < 40) {

			System.out.println("Eres Joven");

		} else if (edad < 65) {

			System.out.println("Eres maduro");

		} else {

			System.out.println("Debes cuidarte");
		}

	}

}
