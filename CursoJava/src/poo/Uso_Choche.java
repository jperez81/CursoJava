package poo;

public class Uso_Choche {

	public static void main(String[] args) {

		Coche Renault = new Coche(); // Instanciar la clase le damos el nombre al objeto y llamamos al constructor ()

		// Renault.establece_color();
		Renault.establece_color("Marron");
		//Renault.color= "Rosa";
		System.out.println(Renault.dime_datos_generales());
		System.out.println(Renault.dime_color());
		
		Renault.configura_asientos("si");//Instanciamos el objeto y le enviamos el parametros "si" al Setters
		System.out.println(Renault.dime_asientos());//nos imprime lo que nos devuelve el Getters seguen el argumento enviadogit 
	}
}
