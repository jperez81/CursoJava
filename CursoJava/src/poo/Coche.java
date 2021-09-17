package poo;

public class Coche {

	private int ruedas; // Encapsulamos cada variable como private
	private int largo;
	private int ancho;
	private int motor;
	@SuppressWarnings("unused")
	private int peso_plataforma;
	private String color;
	private int peso_total;
	private boolean asientos_cuero, climatizador;

	public Coche() {

		ruedas = 4;
		largo = 2000;
		ancho = 300;
		motor = 1600;
		peso_plataforma = 500;

	}

	public String dime_datos_generales() { // Getters
		return "La plataforma del veihuculo tiente " + ruedas + " ruedas " + ". mide " + largo / 1000
				+ " metros con un ancho de " + ancho + " cm y un peso de plataforma de " + peso_plataforma + " kg";
	}

	public void establece_color(String color_choche) { // Setters

		color = color_choche;

		// color = ("Azul");

	}

	public String dime_color() { // GETTERS
		return "El color del coche es : " + color;

	}
	
	public void configura_asientos(String asientos_cuero) { //SETTERS
		
		if(asientos_cuero == "si") {
			this.asientos_cuero = true;
		}else {
			this.asientos_cuero = false;
		}
	}
	public String dime_asientos() {
		if(asientos_cuero == true) {
			return "El coche tiene asientos de cuero";
		}else {
			return "El coche no tiene asientos de cuero";
			
		}
		
	}

}
