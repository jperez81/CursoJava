package Estructuras;

public class Uso_Array_III {

	public static void main(String[] args) {
		
		int Aleatorio [] = new int [900];
		
		for(int i = 0; i< Aleatorio.length; i++) {
			
			Aleatorio[i]= (int)Math.round(Math.random()*100);
			
		}
		int i =1;
		for(int y : Aleatorio) {
			System.out.println( i+ ": "+y);
			i++;
		}

	}

}
 