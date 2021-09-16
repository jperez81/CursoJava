package Estructuras;

import javax.swing.JOptionPane;

public class Uso_Bucle_For {

	public static void main(String[] args) {

		String Nombre = JOptionPane.showInputDialog("Favor de escribir tu nombre : ");

		for (long i = 0; i <= 10; i++) {
			System.out.println(i + ": " +  Nombre);

		}
		   

	}

}
