package BidimensionalArrays;

public class Ejemplo2 {

	public static void main(String[] args) {
		double[][] prices1 = new double [3][2];
		double[][] prices2= {
				{3.979, 4.099},
				{4.199, 4.299, 6.7},
				{4.599, 4.499}
		};
		for (int i = 0; i < prices2.length; i++) {
			for (int j = 0; j < prices2[i].length; j++) { //[i] para leer las filas con mas columnas
				System.out.printf("%10.3f",prices2[i][j]);
			}
			System.out.println();
		}
		
		}
	}