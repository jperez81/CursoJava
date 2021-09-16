package Estructuras;

import javax.swing.JOptionPane;

public class Factorial {

	public static void main(String[] args) {
		
		int numero = Integer.parseInt(JOptionPane.showInputDialog("Favor de digitar un numero :"));
		int resultado = 1;
		
		for (int i = numero; i>0; i--) {
			
			resultado = resultado * i;
			
		}
		JOptionPane.showMessageDialog(null, "El factorial de " + numero + " es " +resultado);
	}

}
