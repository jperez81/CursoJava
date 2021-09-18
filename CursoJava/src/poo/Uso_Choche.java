package poo;
import javax.swing.*;
public class Uso_Choche {

	public static void main(String[] args) {

		Coche Renault = new Coche(); // Instanciar la clase le damos el nombre al objeto y llamamos al constructor ()

		// Renault.establece_color();
		Renault.establece_color(JOptionPane.showInputDialog("Elija el color del auto por favor : "));
		//Renault.color= "Rosa";
		System.out.println(Renault.dime_datos_generales());
		System.out.println(Renault.dime_color());
		
		Renault.configura_asientos(JOptionPane.showInputDialog("Quiere asientos de de cuero ? Si o No"));//Instanciamos el objeto y le enviamos el parametros "si" al Setters
		System.out.println(Renault.dime_asientos());//nos imprime lo que nos devuelve el Getters seguen el argumento enviadogit 
		
		Renault.configura_climatizador(JOptionPane.showInputDialog("Quiere climatizador ? Si o No"));
		System.out.println(Renault.dime_climatizador());
		
		System.out.println(Renault.dime_peso_coche());
		System.out.println("El precio final del coche es : " + Renault.precio_coche());
	}
}
