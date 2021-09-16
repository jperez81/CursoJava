package Estructuras;

import javax.swing.JOptionPane;

public class Entrada_Numeros {

	public static void main(String[] args) {

		
		double num1 = Double.parseDouble(JOptionPane.showInputDialog("Favor de introducir un numero :"));
		
		System.out.print("La raiz de " +num1 + " es ");
		System.out.printf("%1.4f", Math.sqrt(num1));
		
		

	}

}
