package Estructuras;

import javax.swing.*;

public class Uso_Array_II {

	public static void main(String[] args) {


		String paises [ ]= new String[10];
		
		for(int i =0; i < paises.length; i++) {
			
			paises [i]= JOptionPane.showInputDialog("Favor de agregar pais: " +(i+1)+ ".");
			
		}
		for (String L : paises) {
			System.out.println("Pais." + L);
		}

	}

}
