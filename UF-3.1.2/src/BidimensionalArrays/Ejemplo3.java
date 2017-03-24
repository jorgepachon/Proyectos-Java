package BidimensionalArrays;

public class Ejemplo3 {
	
	public static void main(String[] args) {//copiar arrays
		//double[][] prices1 = new double [3][2];
		double[][] prices2= {
				{3.979, 4.099},
				{4.199, 4.299, 6.7},
				{4.599, 4.499}
		};
		double[][] prices1 = new double [prices2.length][];
		
		System.arraycopy( prices2, 0, prices1, 0, prices2.length); 
		
		for (int i = 0; i < prices1.length; i++) {
			for (int j = 0; j < prices1[i].length; j++) { //[i] para leer las filas con mas columnas
				System.out.printf("%10.3f",prices1[i][j]);
			}
			System.out.println();
		}
	}
}
	

//array no dimensiona el array de destino, hay que crearlo