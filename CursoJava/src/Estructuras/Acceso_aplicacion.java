package Estructuras;

import javax.swing.JOptionPane;

public class Acceso_aplicacion {

	public static void main(String[] args) {

		String clave = "12345";
		String pass = "";

		while (clave.equals(pass) == false) {

			pass = JOptionPane.showInputDialog("Favor de ingresar tu contraseña :");

			if (clave.equals(pass) == false) {
				JOptionPane.showMessageDialog(null, "Contraseña incorrecta, vuelva a intentarlo :");

			}

		}
		JOptionPane.showMessageDialog(null, "Contraseña correcta, acceso grantizado :");

	}
	
	

}
