package Estructuras;
/*
 * Contenido de Video 8
 * Curso Java declaracion de constantes.
 * pasar 6 cm a pulgadas
 */
public class DeclaracionOperadores_I {

	public static void main(String[] args) {

		//Creamos una variable para pulgadas 
		final double apulgadas = 2.54;
		//Ahora declaramos la variable cm
		double cm=6;
		
		double resultado= (cm/apulgadas);
		
		
		
		System.out.println("En " + cm + " cm hay " +resultado + " pulgadas ");
	

	}

}
