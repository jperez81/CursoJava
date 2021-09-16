package Estructuras;

import java.util.*;

public class Entrada_Ejemplo1 {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner entrada = new Scanner(System.in);
		
		
		System.out.println("Favor de introducir tu nombre por favor: ");
		String nombre_usuario = entrada.nextLine();
		System.out.println("");
		System.out.println("Por favor introduce tu edad : ");
		int edad = entrada.nextInt();
		System.out.println("");
		System.out.println("Hola " + nombre_usuario + " El año que viene tendras : " +(edad +1) + " años " );

	}

}
