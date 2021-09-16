package Estructuras;

import javax.swing.*;

public class Peso_Ideal {

	public static void main(String[] args) {

		String genero = "";

		do {
			genero = JOptionPane.showInputDialog("Favor de ingresar tu genero  = (H / M )");

		} while (genero.equalsIgnoreCase("H") == false && genero.equalsIgnoreCase("M") == false);
		int altura = Integer.parseInt(JOptionPane.showInputDialog("Favor de agregar tu estatura: "));
		int peso = 0;

		if (genero.equalsIgnoreCase("H")) {

			peso = altura - 100;
		} else if (genero.equalsIgnoreCase("M")) {

			peso = altura - 120;

		}
		JOptionPane.showMessageDialog(null, "Tu peso idea seria : " + peso + " Kilos"	);
	}

}
