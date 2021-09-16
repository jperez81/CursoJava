package Estructuras;

public class Array_Bidimincionales {

	public static void main(String[] args) {

		int Matrix[][] = new int[4][5];

		Matrix[0][0] = 15;
		Matrix[0][1] = 21;
		Matrix[0][2] = 18;
		Matrix[0][3] = 9;
		Matrix[0][4] = 15;

		Matrix[1][0] = 10;
		Matrix[1][1] = 52;
		Matrix[1][2] = 17;
		Matrix[1][3] = 19;
		Matrix[1][4] = 7;

		Matrix[2][0] = 19;
		Matrix[2][1] = 2;
		Matrix[2][2] = 19;
		Matrix[2][3] = 17;
		Matrix[2][4] = 7;

		Matrix[3][0] = 92;
		Matrix[3][1] = 13;
		Matrix[3][2] = 13;
		Matrix[3][3] = 32;
		Matrix[3][4] = 41;
		
		for(int i=0; i<4; i++) {
			System.out.println("");
			for(int j=0; j<5;j++) {
				System.out.print(Matrix[i][j] +" ");
			}	
				
		}

	}

}
