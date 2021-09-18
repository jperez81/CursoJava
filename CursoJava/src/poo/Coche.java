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

	public Coche() { // METODO CONSTRUCTOR LO QUE HACE ES ESTABLECER UN ESTADO INICIAL PARA EL OBJETO
						// COCHE, TIENE QUE SER SIEMPRE PLUBICO

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

	public void configura_asientos(String asientos_cuero) { // SETTERS

		if (asientos_cuero.equalsIgnoreCase("si")) {
			this.asientos_cuero = true;
		} else {
			this.asientos_cuero = false;
		}
	}

	public String dime_asientos() { // GETTERS
		if (asientos_cuero == true) {
			return "El coche tiene asientos de cuero";
		} else {
			return "El coche no tiene asientos de cuero";

		}

	}

	public void configura_climatizador(String climatizador) { // Setters

		if (climatizador .equalsIgnoreCase("si")) {
			this.climatizador = true;
		} else {
			this.climatizador = false;
		}

	}

	public String dime_climatizador() { // Getters

		if (climatizador == true) {
			return "El coche incorpora climatizador";
		} else {

			return "El coche lleva aire acondicionado";
		}
	}

	public String dime_peso_coche() { // MEZCLA DE SETTERS Y GETTERS
		int peso_carroceria = 500;
		peso_total = peso_plataforma + peso_carroceria;
		if (asientos_cuero == true) {
			peso_total = peso_total + 50;
		}
		if (climatizador == true) {
			peso_total = peso_total + 20;
		}
		return "El peso del coche es " + peso_total;
	}

	public int precio_coche() { // GETTERS
		int precio_final = 10000;
		if (asientos_cuero == true) {
			precio_final += 2000;
		}
		if (climatizador == true) {
			precio_final += 1500;
		}
		return precio_final;
	}

}
