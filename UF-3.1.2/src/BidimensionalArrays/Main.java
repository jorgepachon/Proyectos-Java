package BidimensionalArrays;

public class Main {

	public static void main(String[] args) {
		double[][] prices1 = new double [3][2];
		double[][] prices2= {
				{3.979, 4.099},
				{4.199, 4.299, 6.7},
				{4.599, 4.499}
		};
		
			System.out.println("filas son "+ prices1.length);//lee filas
			System.out.println("columnas son "+ prices2[0].length);//[0]posicion filas, lee colonmas
		}
	}


