package Estructuras;

/*
 * Curso Java PI
 * Declaracion de cadenas String y manipulacion de las mismas 
 * con los metodos chartAt / length
 */

public class Cadenas {

	public static void main(String[] args) {

		// declarando cadenas String y contando la cantidad de letras con el metodo
		// .length
		String nombre = "Jose Reinaldo Perez";
		System.out.println(" Mi nombre es : " + nombre);

		System.out.println(" Mi nombre tiene " + nombre.length() + " Letras ");

		System.out.println("La primera letra de mi nombre es : " + nombre.charAt(0));

		// Vamos a buscar cual es la ultima letra de nuestro nombre

		int Ultima_letra = nombre.length();

		// Aca recordar que va -1 dado que el Metodo charAt comienza a contar desde el
		// cero, y el Metodo Length desde el 1
		System.out.println(" La ultima letra de mi nombre es " + nombre.charAt(Ultima_letra - 1));

	}

}
