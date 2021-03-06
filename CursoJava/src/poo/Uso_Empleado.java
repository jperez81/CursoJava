package poo;

import java.util.*;

public class Uso_Empleado {

	public static void main(String[] args) {
		
		/*Empleado emp1= new Empleado("Paco Gomez", 85000, 1990, 12, 17);
		Empleado emp2 = new Empleado("Ana Lopez", 95000, 1995, 06, 02);
		Empleado emp3 = new Empleado("Maria Martin", 105000, 2002, 03, 15);
		
		emp1.SubeSueldo(5);
		emp2.SubeSueldo(5);
		emp3.SubeSueldo(5);
		
		System.out.println("Nombre : " + emp1.dameNombre() + " Su sueldo es : " + emp1.dameSueldo()  + " Fecha de alta : " +emp1.dameFechaContrato() );
		System.out.println("Nombre : " + emp2.dameNombre() + " Su sueldo es : " + emp2.dameSueldo()  + " Fecha de alta : " +emp2.dameFechaContrato() );
		System.out.println("Nombre : " + emp3.dameNombre() + " Su sueldo es : " + emp3.dameSueldo()  + " Fecha de alta : " +emp3.dameFechaContrato() );*/
		
		//AHORA HAREMOS LO MISMO PERO CON ARRAYS
		
		Empleado[] misEmpleados = new Empleado [3];
		misEmpleados[0] = new Empleado("Paco Gomez", 85000, 1990, 12, 17);
		misEmpleados[1] = new Empleado("Ana Lopez", 95000, 1995, 06, 02);
		misEmpleados[2] = new Empleado("Maria Martin", 105000, 2002, 03, 15);
		
		for(int i= 0; i< misEmpleados.length; i++) {
			misEmpleados[i].SubeSueldo(5);
			
		}
		for (int i=0; i<misEmpleados.length; i++) {
			
			System.out.println("Nombre " + misEmpleados[i].dameNombre() + " Sueldo : " + misEmpleados[i].dameSueldo() + " Fecha de alta " + misEmpleados[i].dameFechaContrato());;
		}
				
	}

}

class Empleado {

	public Empleado(String nom, double sue, int a?o, int mes, int dia) {

		nombre = nom;
		sueldo = sue;
		GregorianCalendar calendario = new GregorianCalendar(a?o, mes - 1, dia);
		altaContrato = calendario.getTime();

	}
	public String dameNombre() {
		
		return nombre;
	}

	public double dameSueldo() { // GETTERS

		return sueldo;
	}

	public Date dameFechaContrato() {// GETTERS

		return altaContrato;
	}

	public void SubeSueldo(double porcentaje) { // SETTERS
		double aumento = sueldo * porcentaje / 100;
		sueldo += aumento;

	}

	private String nombre;
	private double sueldo;
	private Date altaContrato;

}
