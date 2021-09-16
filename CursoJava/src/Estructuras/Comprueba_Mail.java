package Estructuras;

import javax.swing.JOptionPane;

public class Comprueba_Mail {

	public static void main(String[] args) {

		boolean arroba = false;
		
		String mail = JOptionPane.showInputDialog("Introduce tu mail : ");
		
		for(int i = 0; i <mail.length(); i++) {
			
			if (mail.charAt(i) == '@') {
				
				arroba = true;
			}
			
		}
		if (arroba == true) {
			JOptionPane.showMessageDialog(null, "El correo es correcto! ");
		}else {
			JOptionPane.showMessageDialog(null,"El correo es incorrecto!");
		}
		
			
		}

}
