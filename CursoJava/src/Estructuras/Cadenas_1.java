package Estructuras;

/*
 * Curso Java 
 * Manipulacion de cadenas 2
 * Utilizando el Metodo SubString
 * 
 */
public class Cadenas_1 {

	public static void main(String[] args) {
		
		String frase= "Hoy es un estupendo dia para aprender a programar en Java";
		//Con el metodo Substring le pediremos solo imnprima desde un lugar determinado de la cadena y hasta donde
		String frase_resumen = frase.substring(29, 57);
		
		System.out.println(frase_resumen);
		
		//Ahora utilizamos el Metodo Equals
		
		System.out.println("Ahora usando el metodo equals");
		System.out.println("");
		
		String alumno1, alumno2;
		
		alumno1 = "Jose";
		alumno2 = "jose";
		
		System.out.println("Los nombres son iguales? = " + alumno1.equals(alumno2));
		
		//Ahora utilizamos el metodos equalsIgnoreCase
		
		String nombre1, nombre2;
		nombre1 = "Ariel";
		nombre2 = "ariel";
		
		System.out.println("Los nombres son iguales sin distinguir mayusculas o minisculas? = " + nombre1.equalsIgnoreCase(nombre2));

	}

}
