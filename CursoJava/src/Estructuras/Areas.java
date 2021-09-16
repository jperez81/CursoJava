package Estructuras;

import javax.swing.JOptionPane;

public class Areas {

	public static void main(String[] args) {

		int figura = Integer.parseInt(JOptionPane.showInputDialog(
				"Favor de seleccionar una figura: \n1: Cuadrado \n2: Rectangulo \n3: Triangulo \n4: Circulo \n0 : salir"));
		double resultado;
		switch (figura) {
		case 1:
			int lado = Integer.parseInt(JOptionPane.showInputDialog("Introduce el lado "));
			resultado =  Math.pow(lado, 2);
			JOptionPane.showMessageDialog(null, "El area del cuadrado es " + resultado);
			JOptionPane.showMessageDialog(null, "El programa finalizo con exito.");
			break;

		case 2:
			int base = Integer.parseInt(JOptionPane.showInputDialog("Favor de introducir la base del rectangulo"));
			int altura = Integer.parseInt(JOptionPane.showInputDialog("Favor de introducir la altura del rectangulo"));
			resultado = base * altura;
			JOptionPane.showMessageDialog(null, "El area de un rectangulo es : " + resultado);
			JOptionPane.showMessageDialog(null, "El programa finalizo con exito.");
			break;

		case 3:
			int baseT = Integer.parseInt(JOptionPane.showInputDialog("Favor de ingresar la base del triagulo"));
			int alturaT = Integer.parseInt(JOptionPane.showInputDialog("Favor de ingresar la altura del triangulo"));
			 resultado = (baseT * alturaT) / 2;
			JOptionPane.showMessageDialog(null,"El area de un triangulo es : " + resultado);
			JOptionPane.showMessageDialog(null,"El programa finalizo con exito.");
			break;
			
		case 4:
			double radio = Double.parseDouble(JOptionPane.showInputDialog("Favor de ingresar el radio del circulo :"));
			
			 resultado = Math.PI * (Math.pow(radio, 2));
			JOptionPane.showMessageDialog(null,"El area de un circulo es : " + Math.round(resultado));
			JOptionPane.showMessageDialog(null, "El programa finalizo con exito.");
			break;

		default:
			JOptionPane.showMessageDialog(null, "La opcion es incorrecta: ");
			break;
		}

	}

}
