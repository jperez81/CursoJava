package Estructuras;

public class Uso_Array {

	public static void main(String[] args) {
		/*
		int Mi_Matriz [] = new int [5];
		Mi_Matriz[0] = 5;
		Mi_Matriz[1] = 38;
		Mi_Matriz[2] = -15;
		Mi_Matriz[3] = 92;
		Mi_Matriz[4] = 71;
		
		/* Una de las formas manuales.
		System.out.println(Mi_Matriz[0]);
		System.out.println(Mi_Matriz[1]);
		System.out.println(Mi_Matriz[2]);
		System.out.println(Mi_Matriz[3]);
		System.out.println(Mi_Matriz[4]);
		*/
		
		int Mi_Matriz[] = { 5, 38, -15, 92, 71, 99, 33, 93, 21, 38, 49, 50, 69, 19, 33, 10, 28, 38, 49, 59, 11};
		
		
		//Forma de imprimir con un bucle for
		for(int i=0; i<Mi_Matriz.length;i++) {
			System.out.println("Valor del indice : " + i + " = " + Mi_Matriz[i]);
			
		}

		
	}

}
