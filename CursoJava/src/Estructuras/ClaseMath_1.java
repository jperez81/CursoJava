package Estructuras;
/*
 *  Curso JAVA - Clase Math
 * 	Video 10 
 * 	Uso del metodo round
 */
public class ClaseMath_1 {
	
	public static void main(String[] args) {
		
		//Redondeando un numero con el metodo round y hacer la refundicion de un numero ateponiendo el tipo de dato luego la expresion
		double num1 = 5.85;
		
		int resultado = (int)Math.round(num1);
		System.out.println("");
		
		System.out.println(" El redondeo de la variable " + num1+ " da como resultado "+resultado);
		
		System.out.println("");
		
		//Elevamos a al exponente un numero con el metodo Math.pow
		double base= 5;
		double exponente= 3;
		
		int resultado1 = (int)Math.pow(base, exponente);
		
		System.out.println(" El valor de la base " + base + " Elevado a al exponente " + exponente + " es " +resultado1);
		
		//Retornando el valor absoluto de un numero
		
		double num0 = 60;
		double num2 = 40;
		
		double resultado2 = num0 + num2;
		
		System.out.println("");		
		System.out.println(" El valor absoluto del resultado de la suma de " +num0+ " y " + num2 + " es " + resultado2 + " y su abs es " + Math.abs(resultado2));
		
	}
	

}
