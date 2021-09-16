package Estructuras;

import java.util.*;

public class Adivina_DoWhile {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner entrada = new Scanner(System.in);
		int aleatorio = (int)(Math.random()*100);
		int numero = 0;
		int intentos =0;
		
		do {
			intentos ++;
			System.out.println("Favor de ingresar un numero");
			 numero = entrada.nextInt();
			 
			 if(aleatorio < numero ) {
				 System.out.println("Favor de ingresar un numero mas Bajo");
				 
			 }else if(aleatorio > numero ){
				 System.out.println("Favor de ingresar un numero mas Alto");
			 }
			 
				 
			 }while(numero != aleatorio);
				System.out.println("Correcto adivinaste, el numero es : "+ aleatorio + " lo adivinaste en " + intentos + " de intentos");
		}

}


